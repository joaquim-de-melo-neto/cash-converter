package edu.monetary.domain;

import java.math.BigDecimal;

/**
 * ConversionData class representing the data required for currency conversion.
 * It holds the amount to be converted, the base currency code, and the target currency code.
 * @author Joaquim Neto
 * @version 1.0
 */
public class ConversionData{

    private final BigDecimal amount; 
    private final String baseCode; 
    private final String targetCode;


    public ConversionData(BigDecimal amount, String baseCode, String targetCode) {
        this.amount = amount;
        this.baseCode = baseCode;
        this.targetCode = targetCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getBaseCode() {
        return baseCode;
    }


    public String getTargetCode() {
        return targetCode;
    }
    
}