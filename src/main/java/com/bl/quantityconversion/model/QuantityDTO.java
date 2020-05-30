package com.bl.quantityconversion.model;

import com.bl.quantityconversion.service.QuantityException;

public class QuantityDTO {
    private QuantityUnit unit;
    private double value;

    public QuantityDTO(QuantityUnit unit, double value) throws QuantityException {
        this.unit = unit;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public QuantityUnit getUnit() {
        return unit;
    }
}
