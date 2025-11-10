package edu.monetary.domain;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;


@Component
public class ConversionData{
    BigDecimal originAmount; BigDecimal destinyAmount; String originCode; String destinyCode;


    public BigDecimal getOriginAmount() {
        return originAmount;
    }


    public BigDecimal getDestinyAmount() {
        return destinyAmount;
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


    public void setDestinyAmount(BigDecimal destinyAmount) {
        this.destinyAmount = destinyAmount;
    }

    
}