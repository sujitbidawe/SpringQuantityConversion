package com.bl.quantityconversion.controller;

import com.bl.quantityconversion.model.QuantityDTO;
import com.bl.quantityconversion.service.IQuantityConversionService;
import com.bl.quantityconversion.service.QuantityException;
import com.bl.quantityconversion.model.QuantityType;
import com.bl.quantityconversion.model.QuantityUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuantityConversionController {

    @Autowired
    IQuantityConversionService quantityConversionService;

    @GetMapping("/quantity")
    public ResponseEntity getQuantityType(){
        return new ResponseEntity(quantityConversionService.getQuantity(), HttpStatus.OK);
    }

    @GetMapping("/unit")
    public ResponseEntity getUnits(@RequestParam QuantityType quantityType){
        return new ResponseEntity(quantityConversionService.getUnits(quantityType), HttpStatus.OK);
    }

    @PostMapping("/convert/{desiredUnit}")
    public ResponseEntity getConversion(@RequestBody QuantityDTO quantity1, @PathVariable QuantityUnit desiredUnit)
                                        throws QuantityException {
        return new ResponseEntity(quantityConversionService.convert(quantity1, desiredUnit), HttpStatus.OK);
    }
}
