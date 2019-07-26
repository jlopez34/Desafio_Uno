package com.challenge.regulation.service;

import com.challenge.regulation.model.Period;

import java.time.LocalDate;
import java.util.List;

public interface RegulationService {

    List<LocalDate> generatePeriodsExpected(LocalDate initialDate, LocalDate finalDate);

    Period searchPeriodMissing(Period periodRegistered, List<LocalDate> periodsExpected);

    Period getMissingPeriods();
}
