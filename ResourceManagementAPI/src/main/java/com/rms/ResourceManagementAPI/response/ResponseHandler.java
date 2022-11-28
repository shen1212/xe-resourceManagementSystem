package com.rms.ResourceManagementAPI.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> reponseBuilder(
            String message, HttpStatus httpStatus,Object responseObject
    )
    {
        Map<String,Object> response = new HashMap<>();
        Map<String,Object> statusResponse = new HashMap<>();

        statusResponse.put("Message",message);
        statusResponse.put("Type",httpStatus);
        statusResponse.put("Code",httpStatus.value());
        statusResponse.put("Timestamp",new Date().toString());

        response.put("Status",statusResponse);
        response.put("Response",responseObject);

        return new ResponseEntity<Object>(response,httpStatus);
    }
}
