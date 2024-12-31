package com.sic.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sic.app.models.FormDataDTO;
import com.sic.app.models.FormDataRequest;
import com.sic.app.models.FormDataResponse;
import com.sic.app.services.FormDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/form")
public class FormController {
    
    @Autowired
    private FormDataService formDataService;

    @PostMapping("/create")
    public ResponseEntity<FormDataResponse> createGrade(@RequestBody FormDataRequest dataRequest){
        FormDataDTO dataResponse = formDataService.createRecord(dataRequest);
        FormDataResponse response = FormDataResponse.createSuccessResponse(dataResponse);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    
}
