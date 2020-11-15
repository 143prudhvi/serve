package com.simplify.serve.repository;

import java.util.List;

import com.simplify.serve.dto.SlipResponse;
import com.simplify.serve.entity.Slip;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface sliprepo extends JpaRepository<Slip,Integer>{
 
    @Query("select new com.simplify.serve.dto.SlipResponse(count(lotno),avg(price*weight),avg(price),avg(weight),sum(weight)) from Slip")
    public List<SlipResponse> getData();
}
