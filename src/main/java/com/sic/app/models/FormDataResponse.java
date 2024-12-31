package com.sic.app.models;

import java.util.List;

import lombok.Data;

@Data
public class FormDataResponse<T> {
    private String status;
    private String message; 
    private T data; 

    public static FormDataResponse<FormDataDTO> createSuccessResponse(FormDataDTO data) {
        FormDataResponse<FormDataDTO> response = new FormDataResponse<>();
        response.setStatus("OK");
        response.setMessage("Successfully retrieved");
        response.setData(data);
        return response;
    }

    public static <T> FormDataResponse<List<T>> createSuccessResponseList(List<T> data) {
        FormDataResponse<List<T>> response = new FormDataResponse<>();
        response.setStatus("OK");
        response.setMessage("Successfully retrieved multiple records");
        response.setData(data);
        return response;
    }
}

