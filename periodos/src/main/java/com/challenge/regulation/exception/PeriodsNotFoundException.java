package com.challenge.regulation.exception;

import org.springframework.core.NestedRuntimeException;

public class PeriodsNotFoundException extends NestedRuntimeException {

    /**
     * Periods not found exception
     * @author Jaime Lopez
     */
    public PeriodsNotFoundException() {
        super(String.format("Periods not founded"));
    }
}
