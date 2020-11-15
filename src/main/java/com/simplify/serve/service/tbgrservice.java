package com.simplify.serve.service;

import java.util.List;

import com.simplify.serve.entity.Tbgr;
import com.simplify.serve.repository.tbgrrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tbgrservice {
    @Autowired
    private tbgrrepo repo;

    public Tbgr saveTbgr(Tbgr tbgr){
        return repo.save(tbgr);
    }
    public List<Tbgr> saveTbgrs(List<Tbgr> tbgr){
        return repo.saveAll(tbgr);
    }
    public List<Tbgr> getTbgrs(){
        return repo.findAll();
    }
    public Tbgr getTbgrById(int tbgr){
        return repo.findById(tbgr).orElse(null);
    }
    public String deleteTbgr(int tbgr){
        repo.deleteById(tbgr);
        return "tbgr removed !! " +tbgr;
    }
    public Tbgr updateTbgr(Tbgr tbgr){
        Tbgr existingTbgr=repo.findById(tbgr.getTbgr()).orElse(null);
        existingTbgr.setName(tbgr.getName());
        existingTbgr.setTbgr(tbgr.getTbgr());
        existingTbgr.setBoard(tbgr.getBoard());
        existingTbgr.setVillage(tbgr.getVillage());
        return repo.save(existingTbgr);
    }
}
