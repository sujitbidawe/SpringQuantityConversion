package com.bl.quantityconversion.model;

public enum QuantityUnit {

    FEET(12.0, QuantityType.LENGTH),
    INCH(1.0, QuantityType.LENGTH),
    YARD(36, QuantityType.LENGTH),
    CM(1.0/2.5, QuantityType.LENGTH),
    LITRE(1.0, QuantityType.VOLUME),
    GALLON(3.78, QuantityType.VOLUME),
    MILILITRE(1.0/1000.0, QuantityType.VOLUME),
    KG(1.0, QuantityType.WEIGHT),
    GRAM(1.0/1000.0, QuantityType.WEIGHT),
    TONNE(1000.0, QuantityType.WEIGHT),
    CELSIUS(9.0/5.0, QuantityType.TEMPERATURE),
    FAHRENHEIT(5.0/9.0, QuantityType.TEMPERATURE);

    public double baseUnitComparison;
    public QuantityType quantityType;

    QuantityUnit(double baseUnitComparison, QuantityType quantityType){
        this.baseUnitComparison = baseUnitComparison;
        this.quantityType = quantityType;
    }
}
