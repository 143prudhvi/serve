package com.simplify.serve.repository;

import com.simplify.serve.entity.Grade;

import org.springframework.data.jpa.repository.JpaRepository;

public interface graderepo extends JpaRepository<Grade,Integer>{
    
}
