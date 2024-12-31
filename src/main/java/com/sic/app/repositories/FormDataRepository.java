package com.sic.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sic.app.entities.FormData;

@Repository
public interface FormDataRepository extends JpaRepository<FormData, Long>{
    
}
