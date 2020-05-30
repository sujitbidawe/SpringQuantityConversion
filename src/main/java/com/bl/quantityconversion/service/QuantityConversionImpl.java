package com.bl.quantityconversion.service;

import com.bl.quantityconversion.model.QuantityDTO;
import com.bl.quantityconversion.model.QuantityType;
import com.bl.quantityconversion.model.QuantityUnit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class QuantityConversionImpl implements IQuantityConversionService{

    @Override
    public List<QuantityType> getQuantity() {
        return Arrays.asList(QuantityType.values());
    }

    @Override
    public List<QuantityUnit> getUnits(QuantityType quantityType) {
        QuantityUnit[] unitAll = QuantityUnit.values();
        List<QuantityUnit> unit  = new ArrayList();
        for (QuantityUnit element : unitAll) {
            if (element.quantityType == quantityType) {
                unit.add(element);
            }
        }
        return unit;
    }

    @Override
    public QuantityDTO convert(QuantityDTO quantity1, QuantityUnit desiredUnit) throws QuantityException {
        if(quantity1.getValue() < 0.0
                && !quantity1.getUnit().equals(QuantityUnit.FAHRENHEIT.quantityType )
                && !quantity1.getUnit().equals(QuantityUnit.CELSIUS.quantityType )){
            throw new QuantityException(QuantityException.ExceptionType.NEGATIVE_VALUE, "quantities cannot be negative");
        }
        if(!quantity1.getUnit().quantityType.equals(desiredUnit.quantityType)) {
            throw new QuantityException(QuantityException.ExceptionType.DIFFERENT_QUANTITY_TYPE, "Different type of quantities");
        }
        if(quantity1.getUnit().equals(QuantityUnit.FAHRENHEIT)){
            return new QuantityDTO(desiredUnit,
                    (quantity1.getValue() - 32 ) * quantity1.getUnit().baseUnitComparison);
        }
        if(quantity1.getUnit().equals(QuantityUnit.CELSIUS)){
            return new QuantityDTO(desiredUnit,
                    (quantity1.getValue() * quantity1.getUnit().baseUnitComparison ) + 32.0 );
        }
        double valueInBaseUnit = quantity1.getValue() * quantity1.getUnit().baseUnitComparison;
        return new QuantityDTO (desiredUnit, valueInBaseUnit / desiredUnit.baseUnitComparison);
    }
}
