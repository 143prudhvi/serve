package com.simplify.serve.controller;

import java.util.List;

import com.simplify.serve.entity.Tbgr;
import com.simplify.serve.service.tbgrservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class tbgrcontroller {
    
    @Autowired
    private tbgrservice service;

    @PostMapping("/addtbgr")
    public Tbgr addTbgr(@RequestBody Tbgr tbgr){
        return service.saveTbgr(tbgr);
    }

    @PostMapping("/addtbgrs")
    public List<Tbgr> addTbgrs(@RequestBody List<Tbgr> tbgrs){
        return service.saveTbgrs(tbgrs);
    }

    @GetMapping("/tbgrs")
    public List<Tbgr> findAllTbgrs(){
        return service.getTbgrs();
    }

    @GetMapping("/tbgrid/{tbgr}")
    public Tbgr findTbgrById(@PathVariable int tbgr){
        return service.getTbgrById(tbgr);
    }

    @PutMapping("/updatetbgr")
    public Tbgr updateTbgr(@RequestBody Tbgr tbgr){
        return service.updateTbgr(tbgr);
    }

    @DeleteMapping("/deletetbgr/{tbgr}")
    public String deleteTbgr(@PathVariable int tbgr){
        return service.deleteTbgr(tbgr);
    }
}
