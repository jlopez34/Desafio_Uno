package com.challenge.regulation.controller;

import com.challenge.regulation.exception.PeriodsNotFoundException;
import com.challenge.regulation.model.Period;
import com.challenge.regulation.service.RegulationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class
 * @author Jaime Lopez
 * @Since 1.0.0
 */
@RestController
@RequestMapping("regulation")
@Api(value = "Regulation microservice", description = "This API finds the missing periods between two dates")
public class RegulationController {
    private static final Log log = LogFactory.getLog(RegulationController.class);

    private final RegulationService regulationService;
    private Period period;

    @Autowired
    public RegulationController(RegulationService regulationService) {
        this.regulationService = regulationService;
    }

    /**
     * Get the missing periods between two dates;
     * @return a controller
     */
    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Find a Missing Periods", notes = "Return the missing periods also the periods registered" )
    public ResponseEntity<Period> getMissingPeriods() throws PeriodsNotFoundException {
        log.info("Get Missing Periods");
        try {
            period = regulationService.getMissingPeriods();
        } catch (PeriodsNotFoundException e) {
            period = null;
        }
        return ResponseEntity.ok(period);

    }
}
