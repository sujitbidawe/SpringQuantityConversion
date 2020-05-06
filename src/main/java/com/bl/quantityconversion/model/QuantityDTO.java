package com.bl.quantityconversion.model;

import com.bl.quantityconversion.service.QuantityException;

public class QuantityDTO {
    private QuantityUnit unit;
    private double value;

    public QuantityDTO(QuantityUnit unit, double value) throws QuantityException {
        this.unit = unit;
        this.value = value;

        if(value < 0.0
                && !unit.quantityType.equals(QuantityUnit.FAHRENHEIT.quantityType )
                && !unit.quantityType.equals(QuantityUnit.CELSIUS.quantityType )){
            throw new QuantityException(QuantityException.ExceptionType.NEGATIVE_VALUE, "quantities cannot be negative");
        }
    }

    public double getValue() {
        return value;
    }

    public QuantityUnit getUnit() {
        return unit;
    }
}
