package com.bl.quantityconversion.Controller;

import com.bl.quantityconversion.service.IQuantityConversionService;
import com.bl.quantityconversion.service.QuantityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuantityConversionController {

    @Autowired
    IQuantityConversionService quantityConversionService;

    @GetMapping("/getQuantity")
    public ResponseEntity getQuantityType(){
        return new ResponseEntity(quantityConversionService.getQuantity(), HttpStatus.OK);
    }

    @PostMapping("/getUnit")
    public ResponseEntity getUnit(QuantityType qType){
        QuantityType quantityType = qType;
        return new ResponseEntity(quantityConversionService.getUnit(quantityType), HttpStatus.OK);
    }
}
