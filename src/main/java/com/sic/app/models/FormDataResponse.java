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

    public static FormDataResponse<List<FormDataDTO>> createSuccessResponseList(List<FormDataDTO> data) {
        FormDataResponse<List<FormDataDTO>> response = new FormDataResponse<>();
        response.setStatus("OK");
        response.setMessage("Successfully retrieved multiple records");
        response.setData(data);
        return response;
    }
}

