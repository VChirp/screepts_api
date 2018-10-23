package com.screepts.screepts_api.model.dto;

import java.util.HashMap;

public class ResponseDto {

    private HashMap<String, Object> response = new HashMap<>();

    public ResponseDto(Object obj) {
        response.put("info", obj);
    }

    public HashMap<String, Object> getResponse() {
        return response;
    }

    public void setResponse(HashMap<String, Object> response) {
        this.response = response;
    }
}
