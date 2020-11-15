package com.simplify.serve.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TBGR_TBL")
public class Tbgr {
    
    
    private String board;
    private String village;
    @Id
    private int tbgr;
    private String name;

    public int getTbgr() {
        return tbgr;
    }

    public void setTbgr(int tbgr) {
        this.tbgr = tbgr;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
