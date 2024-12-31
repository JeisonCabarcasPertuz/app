package com.sic.app.models;

import lombok.Data;

@Data
public class FormDataResponse {
    private String status;
    private String message; 
    private FormDataDTO data;

    public static FormDataResponse createSuccessResponse(FormDataDTO data) {
        FormDataResponse response = new FormDataResponse();
        response.setStatus("success");
        response.setMessage("Record created successfully");
        response.setData(data);
        return response;
    }
}
