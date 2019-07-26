package com.challenge.regulation.service.impl;

import com.challenge.regulation.model.Period;
import com.challenge.regulation.repository.RegulationRepository;
import com.challenge.regulation.service.RegulationService;
import com.challenge.regulation.service.wrapper.RegulationWrapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service class
 * @author Jaime Lopez
 * @Since 1.0.0
 */

@Service("regulationService")
public class RegulationServiceImpl implements RegulationService {

    private static final Log log = LogFactory.getLog(RegulationServiceImpl.class);

    private static final long serialVersionUID = -1L;

    private RegulationRepository regulationRepository;

    @Autowired
    public RegulationServiceImpl(RegulationRepository regulationRepository) {
        this.regulationRepository = regulationRepository;
    }

    /**
     * Generate the periods expected to be registered between two dates
     * @param initialDate
     * @param finalDate
     * @return
     */
    public List<LocalDate> generatePeriodsExpected(LocalDate initialDate, LocalDate finalDate) {
        List<LocalDate> periodsExpected = new ArrayList<LocalDate>();
        try {

            long monthsBetween = ChronoUnit.MONTHS.between(initialDate.withDayOfMonth(1), finalDate.withDayOfMonth(1));

            for (int month = 1; month < monthsBetween; month++) {
                periodsExpected.add(initialDate.plusMonths(month));
            }

        } catch (Exception e) {
            log.error(String.format("Unexpected problem has been generated : '%s' ", e.getMessage()));
        }

        return periodsExpected;
    }

    /**
     * Find the missing periods
     * @param periodRegistered
     * @param periodsExpected
     * @return
     */
    public Period searchPeriodMissing(Period periodRegistered, List<LocalDate> periodsExpected) {
        Period periodMissing = new Period();

        try {
            periodMissing.setId(periodRegistered.getId());
            periodMissing.setFechaCreacion(periodRegistered.getFechaCreacion());
            periodMissing.setFechaFin(periodRegistered.getFechaFin());
            periodMissing.setFechas(periodRegistered.getFechas());

            List<LocalDate> periods = periodsExpected.stream().filter(aObject -> {
                return !periodRegistered.getFechas().contains(aObject);
            }).collect(Collectors.toList());

            periodMissing.setFechasFaltantes(periods);

        } catch (Exception e) {
            log.error(String.format("Unexpected problem has been generated : '%s' ", e.getMessage()));
        }

        return periodMissing;
    }

    /**
     * Get periods from external service and finding the missing periods
     * @return
     */
    public Period getMissingPeriods() {
        Period regulation = null;
        try {
            Period periodRegistered = RegulationWrapper.regulationToPeriod(regulationRepository.getPeriodsRegistered());
            if (periodRegistered != null) {
                List<LocalDate> periodsExpected = generatePeriodsExpected(periodRegistered.getFechaCreacion(), periodRegistered.getFechaFin());
                regulation = searchPeriodMissing(periodRegistered, periodsExpected);
            }
        } catch (Exception e) {
            log.error(String.format("Unexpected problem has been generated : '%s' ", e.getMessage()));
        }

        return regulation;
    }


    /*public static void main(String[] args) {
        RegulationServiceImpl reg = new RegulationServiceImpl();
        Period period = reg.getPeridMock();
        List<LocalDate> periodsExpected = reg.generatePeriodsExpected(period.getFechaCreacion(), period.getFechaFin());
        Period periodMissing = reg.searchPeriodMissing(period, periodsExpected);
        System.out.println(periodMissing.toString());
    }*/
}
