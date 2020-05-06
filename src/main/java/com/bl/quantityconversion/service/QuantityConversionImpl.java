package com.bl.quantityconversion.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class QuantityConversionImpl implements IQuantityConversionService{

    @Override
    public List<QuantityType> getQuantity() {
        List<QuantityType> quantityTypes = Arrays.asList(QuantityType.values());
        return quantityTypes;
    }

    @Override
    public List<Unit> getUnit(QuantityType quantityType) {
        List<Unit> unitAll = Arrays.asList(Unit.values());
        List<Unit> unit  = new ArrayList<>();
        for (Unit element : unitAll) {
            if (element.quantityType == quantityType) {
                unit.add(element);
            }
        }
        return unit;
    }
}
