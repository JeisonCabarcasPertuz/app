package com.sic.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sic.app.entities.Model;
import com.sic.app.models.FormDataResponse;
import com.sic.app.services.ModelService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/model")
@CrossOrigin(origins = "http://localhost:5173")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @GetMapping()
    public ResponseEntity<FormDataResponse<List<Model>>> getRecords() {
        List<Model> dataResponse = modelService.getModels();
        FormDataResponse<List<Model>> response = FormDataResponse.createSuccessResponseList(dataResponse);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    } 
    
}
