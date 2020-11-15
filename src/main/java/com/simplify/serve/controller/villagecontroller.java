package com.simplify.serve.controller;

import java.util.List;

import com.simplify.serve.entity.Village;
import com.simplify.serve.service.villageservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class villagecontroller {
    
    @Autowired
    private villageservice service;

    @PostMapping("/addvillage")
    public Village addVillage(@RequestBody Village village){
        return service.saveVillage(village);
    }

    @PostMapping("/addvillages")
    public List<Village> addVillages(@RequestBody List<Village> villages){
        return service.saveVillages(villages);
    }

    @GetMapping("/villages")
    public List<Village>  findAllVillages(){
        return service.getVillages();
    }

    @GetMapping("/village/{id}")
    public Village findVillageById(@PathVariable int id){
        return service.getVillageById(id);
    }

    @PutMapping("/updatevillage")
    public Village updateVillage(Village village){
        return service.updateVillage(village);
    }

    @DeleteMapping("/deletevillage/{id}")
    public String deleteVillage(@PathVariable int id){
        return service.deleteVillage(id);
    }
}
