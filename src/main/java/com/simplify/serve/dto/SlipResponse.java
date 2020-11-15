package com.simplify.serve.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SlipResponse {
    
    private long slipcount;
    private double costavg;
    private double priceavg;
    private double weightavg;
    private long totalweight;

    public SlipResponse(long slipcount, double costavg, double priceavg, double weightavg, long totalweight) {
        this.slipcount = slipcount;
        this.costavg = costavg;
        this.priceavg = priceavg;
        this.weightavg = weightavg;
        this.totalweight = totalweight;
    }

    public long getSlipcount() {
        return slipcount;
    }

    public void setSlipcount(long slipcount) {
        this.slipcount = slipcount;
    }

    public double getCostavg() {
        return costavg;
    }

    public void setCostavg(double costavg) {
        this.costavg = costavg;
    }

    public double getPriceavg() {
        return priceavg;
    }

    public void setPriceavg(double priceavg) {
        this.priceavg = priceavg;
    }

    public double getWeightavg() {
        return weightavg;
    }

    public void setWeightavg(double weightavg) {
        this.weightavg = weightavg;
    }

    public long getTotalweight() {
        return totalweight;
    }

    public void setTotalweight(long totalweight) {
        this.totalweight = totalweight;
    }

}
