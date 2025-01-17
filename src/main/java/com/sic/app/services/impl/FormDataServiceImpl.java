package com.sic.app.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sic.app.entities.FormData;
import com.sic.app.mappers.FormDataMapper;
import com.sic.app.models.FormDataDTO;
import com.sic.app.models.FormDataRequest;
import com.sic.app.repositories.FormDataRepository;
import com.sic.app.services.FormDataService;

@Service
public class FormDataServiceImpl implements FormDataService {

    private final FormDataRepository formDataRepository;

    private final FormDataMapper formDataMapper;

    public FormDataServiceImpl(FormDataRepository formDataRepository, FormDataMapper formDataMapper){
        this.formDataRepository = formDataRepository;
        this.formDataMapper = formDataMapper;
    }

    @Override
    public FormDataDTO createRecord(FormDataRequest formDataRequest) {
        FormData formData = formDataMapper.formDataRequestToFormData(formDataRequest);
        return formDataMapper.formDataToFormDataDTO(formDataRepository.save(formData));
    }

    @Override
    public List<FormDataDTO> getRecords() {
        List<FormData> listFormData = formDataRepository.findAll();
         return listFormData.stream()
                       .map(formData -> formDataMapper.formDataToFormDataDTO(formData))
                       .collect(Collectors.toList()); 
    }
}
