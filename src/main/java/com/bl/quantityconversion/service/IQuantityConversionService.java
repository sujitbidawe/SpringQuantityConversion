package com.bl.quantityconversion.service;

import com.bl.quantityconversion.model.QuantityDTO;
import com.bl.quantityconversion.model.QuantityType;
import com.bl.quantityconversion.model.QuantityUnit;

import java.util.List;

public interface IQuantityConversionService {
    List<QuantityType> getQuantity();
    List<QuantityUnit> getUnits(QuantityType quantityType);
    QuantityDTO convert(QuantityDTO quantity1, QuantityUnit desiredUnit) throws QuantityException;
}
