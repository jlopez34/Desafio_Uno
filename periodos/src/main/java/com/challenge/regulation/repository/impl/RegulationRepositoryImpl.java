package com.challenge.regulation.repository.impl;

import com.challenge.regulation.repository.RegulationRepository;
import com.challenge.regulation.repository.entity.Regulation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * Repository class
 * @author Jaime Lopez
 * @Since 1.0.0
 */
@Repository
public class RegulationRepositoryImpl implements RegulationRepository {

    private static final Log log = LogFactory.getLog(RegulationRepositoryImpl.class);

    //using npm run jason:server
    public static final String SERVICE_PERIOD_JSON = "http://localhost:3000/periodo";
    //using data generator to the challenge
    public static final String SERVICE_PERIOD_JAR = "http://127.0.0.1:8080/periodos/api";

    /**
     * Periods registered by customer
     * @return
     */
    public Regulation getPeriodsRegistered() {
        final String uri = SERVICE_PERIOD_JAR;
        ResponseEntity<Regulation> result = null;

        try{
            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

            result = restTemplate.exchange(uri, HttpMethod.GET, entity, Regulation.class);
        }catch (Exception e){
            log.error(String.format("Unexpected problem has been generated : '%s' " , e.getMessage() ));
        }

        return result.getBody();
    }

}
