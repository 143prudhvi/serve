package com.simplify.serve.service;

import java.util.List;

import com.simplify.serve.entity.Grade;
import com.simplify.serve.repository.graderepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class gradeservice {
    
    @Autowired
    private graderepo repo;

    public Grade saveGrade(Grade grade){
        return repo.save(grade);
    }
    public List<Grade> saveGrades(List<Grade> grade){
        return repo.saveAll(grade);
    }
    public List<Grade> getGrades(){
        return repo.findAll();
    }
    public Grade getGradeById(int id){
        return repo.findById(id).orElse(null);
    }
    public String deleteGrade(int id){
        repo.deleteById(id);
        return "grade removed !! " +id;
    }
    public Grade updateGrade(Grade grade){
        Grade existingGrade=repo.findById(grade.getId()).orElse(null);
        existingGrade.setGrade(grade.getGrade());
        existingGrade.setId(grade.getId());
        return repo.save(existingGrade);
    }
}
