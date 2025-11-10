package edu.monetary.domain;

import java.math.BigDecimal;

public class ConversionData{
    BigDecimal originAmount; String originCode; String destinyCode;


    public BigDecimal getOriginAmount() {
        return originAmount;
    }

    public String getOriginCode() {
        return originCode;
    }


    public String getDestinyCode() {
        return destinyCode;
    }


    public void setOriginAmount(BigDecimal originAmount) {
        this.originAmount = originAmount;
    }


    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }


    public void setDestinyCode(String destinyCode) {
        this.destinyCode = destinyCode;
    }

    
}