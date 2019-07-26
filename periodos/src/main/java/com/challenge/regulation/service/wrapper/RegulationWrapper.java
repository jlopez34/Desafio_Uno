package com.challenge.regulation.service.wrapper;

import com.challenge.regulation.model.Period;
import com.challenge.regulation.repository.entity.Regulation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class RegulationWrapper {

    private static final Log log = LogFactory.getLog(RegulationWrapper.class);

    public static Period regulationToPeriod(Regulation regulation) {
        Period period = null;
        try {
            if (regulation != null) {
                List<LocalDate> fechas = new ArrayList<>();
                period = new Period();
                period.setId(regulation.getId());
                period.setFechaCreacion(LocalDate.parse(regulation.getFechaCreacion()));
                period.setFechaFin(LocalDate.parse(regulation.getFechaFin()));

                for (String fecha : regulation.getFechas()) {
                    fechas.add(LocalDate.parse(fecha));
                }

                period.setFechas(fechas);

            }
        } catch (Exception e) {
            log.error(String.format("Unexpected problem has been generated : '%s' " , e.getMessage() ));
        }

        return period;
    }
}
