package com.simplify.serve.controller;

import java.util.List;

import com.simplify.serve.dto.SlipResponse;
import com.simplify.serve.entity.Slip;
import com.simplify.serve.service.slipservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;


import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class slipcontroller {
    
    @Autowired
    private slipservice service;

    @PostMapping("/addslip")
    public Slip addSlip(@RequestBody Slip slip){
        return service.saveSlip(slip);
    }

    @PostMapping("/addslips")
    public List<Slip> addSlips(@RequestBody List<Slip> slips){
        return service.saveSlips(slips);
    }

    @GetMapping("/slips")
    public List<Slip> findAllSlips(){
        return service.getSlips();
    }

    @GetMapping("/slip/{lotno}")
    public Slip findSlipById(@PathVariable int lotno){
        return service.getSlipById(lotno);
    }

    @PutMapping("/updateslip")
    public Slip updateSlip(@RequestBody Slip slip){
        return service.updateSlip(slip);
    }

    @DeleteMapping("/deleteslip/{lotno}")
    public String deleteSlip(@PathVariable int lotno){
        return service.deleteSlip(lotno);
    }

    @GetMapping("/data")
    public List<SlipResponse> getData(){
        return service.getData();
    }
}
