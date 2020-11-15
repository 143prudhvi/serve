package com.simplify.serve.repository;

import com.simplify.serve.entity.Contact;

import org.springframework.data.jpa.repository.JpaRepository;

public interface contactrepo extends JpaRepository<Contact,Long>{
    
}
