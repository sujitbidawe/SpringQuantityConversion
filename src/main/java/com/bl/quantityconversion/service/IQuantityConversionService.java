package com.bl.quantityconversion.service;

import java.util.List;

public interface IQuantityConversionService {
    List<QuantityType> getQuantity();
    List<Unit> getUnit(QuantityType quantityType);
}
