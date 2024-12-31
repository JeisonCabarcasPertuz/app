package com.sic.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sic.app.entities.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long>{
    
}
