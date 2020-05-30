package com.bl.quantityconversion.exception;

import com.bl.quantityconversion.service.QuantityException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class QuantityMeasurementGlobalExceptionHandler {

    @ExceptionHandler(QuantityException.class)
    public ResponseEntity handleQMException(QuantityException quantityException){
        return new ResponseEntity(quantityException.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
