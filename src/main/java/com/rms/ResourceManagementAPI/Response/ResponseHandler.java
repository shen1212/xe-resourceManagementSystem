package com.rms.ResourceManagementAPI.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> responseBuilder(
            HttpStatus httpStatus, Object responseObject
    ){
        Map<String,Object> response = new HashMap<>();
        response.put("HttpStatus", httpStatus);
        String SQUAD = null;
        String TRIBE = null;
        BigInteger EMPL_NUMBER = null;
        Double AVGPRIORITY = null;
//        for (Object[] ob : responseObject) {
//            SQUAD = (String) ob[0];
//            TRIBE = (String) ob[1];
//            EMPL_NUMBER = (BigInteger) ob[2];
//            AVGPRIORITY = (Double) ob[3];
//        }
//        response.put("Squad",squad);
//        response.put("Tribe",tribe);
//        response.put("Empl_number",employee_number);
//        response.put("AvgPriority",avgPriority);


        return new ResponseEntity<>(response,httpStatus);
    }

}
