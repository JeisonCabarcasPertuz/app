package com.sic.app.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sic.app.entities.Model;
import com.sic.app.repositories.ModelRepository;
import com.sic.app.services.ModelService;

@Service
public class ModelServiceImpl implements ModelService{
    private final ModelRepository modelRepository;

    public ModelServiceImpl(ModelRepository modelRepository){
        this.modelRepository = modelRepository;
    }
    @Override
    public List<Model> getModels() {
        return modelRepository.findAll();
    }
    
}
