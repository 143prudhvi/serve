package com.simplify.serve.service;

import java.util.List;

import com.simplify.serve.entity.Village;
import com.simplify.serve.repository.villagerepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class villageservice {

    @Autowired
    private villagerepo repo;
    public Village saveVillage(Village village){
        return repo.save(village);
    }
    public List<Village> saveVillages(List<Village> village){
        return repo.saveAll(village);
    }
    public List<Village> getVillages(){
        return repo.findAll();
    }
    public Village getVillageById(int id){
        return repo.findById(id).orElse(null);
    }
    public String deleteVillage(int id){
        repo.deleteById(id);
        return "village removed !! " +id;
    }
    public Village updateVillage(Village village){
        Village existingVillage=repo.findById(village.getId()).orElse(null);
        existingVillage.setVillage(village.getVillage());
        existingVillage.setId(village.getId());
        existingVillage.setBoard(village.getBoard());
        return repo.save(existingVillage);
    }
    
}
