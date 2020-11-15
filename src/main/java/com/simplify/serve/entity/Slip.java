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
@Table(name = "SLIP_TBL")
public class Slip {

    private String date;
    private int tbgr;
    private String grade;
    @Id
    private int lotno;
    private int weight;
    private int price;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTbgr() {
        return tbgr;
    }

    public void setTbgr(int tbgr) {
        this.tbgr = tbgr;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getLotno() {
        return lotno;
    }

    public void setLotno(int lotno) {
        this.lotno = lotno;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
