package edu.monetary.domain;

import java.math.BigDecimal;

public record ConversionData(BigDecimal originAmount, BigDecimal destinyAmount, String originCode, String destinyCode){}