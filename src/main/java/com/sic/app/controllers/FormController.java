package com.sic.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sic.app.models.FormDataDTO;
import com.sic.app.models.FormDataRequest;
import com.sic.app.models.FormDataResponse;
import com.sic.app.services.FormDataService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/form")
@CrossOrigin(origins = "http://localhost:5173")
public class FormController {
    
    @Autowired
    private FormDataService formDataService;

    @PostMapping("/create")
    public ResponseEntity<FormDataResponse<FormDataDTO>> createGrade(@RequestBody FormDataRequest dataRequest) {
        FormDataDTO dataResponse = formDataService.createRecord(dataRequest);
        FormDataResponse<FormDataDTO> response = FormDataResponse.createSuccessResponse(dataResponse);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    
    @GetMapping("/history")
    public ResponseEntity<FormDataResponse<List<FormDataDTO>>> getRecords() {
        List<FormDataDTO> dataResponse = formDataService.getRecords();
        FormDataResponse<List<FormDataDTO>> response = FormDataResponse.createSuccessResponseList(dataResponse);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    } 
    
}
