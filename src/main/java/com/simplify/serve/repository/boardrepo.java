package com.simplify.serve.repository;

import com.simplify.serve.entity.Board;

import org.springframework.data.jpa.repository.JpaRepository;

public interface boardrepo extends JpaRepository<Board , Integer> {
    
}
