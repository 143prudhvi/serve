package com.simplify.serve.service;

import java.util.List;

import com.simplify.serve.dto.SlipResponse;
import com.simplify.serve.entity.Slip;
import com.simplify.serve.repository.sliprepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class slipservice {
    
    @Autowired
    private sliprepo repo;

    public Slip saveSlip(Slip slip){
        return repo.save(slip);
    }
    public List<Slip> saveSlips(List<Slip> slip){
        return repo.saveAll(slip);
    }
    public List<Slip> getSlips(){
        return repo.findAll();
    }
    public Slip getSlipById(int lotno){
        return repo.findById(lotno).orElse(null);
    }
    public String deleteSlip(int lotno){
        repo.deleteById(lotno);
        return "slip removed !! " +lotno;
    }
    public Slip updateSlip(Slip slip){
        Slip existingSlip=repo.findById(slip.getLotno()).orElse(null);
        existingSlip.setDate(slip.getDate());
        existingSlip.setTbgr(slip.getTbgr());
        existingSlip.setGrade(slip.getGrade());
        existingSlip.setLotno(slip.getLotno());
        existingSlip.setWeight(slip.getWeight());
        existingSlip.setPrice(slip.getPrice());
        return repo.save(existingSlip);
    }
    public List<SlipResponse> getData(){
        return repo.getData();
    }
}
