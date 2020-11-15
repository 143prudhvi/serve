package com.simplify.serve.controller;

import java.util.List;

import com.simplify.serve.entity.Grade;
import com.simplify.serve.service.gradeservice;

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
public class gradecontroller {
    
    @Autowired
    private gradeservice service;

    @PostMapping("/addgrade")
    public Grade addGrade(@RequestBody Grade grade){
        return service.saveGrade(grade);
    }

    @PostMapping("/addgrades")
    public List<Grade> addGrades(@RequestBody List<Grade> grades){
        return service.saveGrades(grades);
    }

    @GetMapping("/grades")
    public List<Grade> findAllGrades(){
        return service.getGrades();
    }

    @GetMapping("/grade/{id}")
    public Grade findGradeById(@PathVariable int id){
        return service.getGradeById(id);
    }

    @PutMapping("/updategrade")
    public Grade updateGrade(@RequestBody Grade grade){
        return service.updateGrade(grade);
    }

    @DeleteMapping("/deletegrade/{id}")
    public String deleteGrade(@PathVariable int id){
        return service.deleteGrade(id);
    }
}
