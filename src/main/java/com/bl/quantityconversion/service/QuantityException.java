package com.bl.quantityconversion.service;

public class QuantityException extends Exception {
    ExceptionType type;

    public enum ExceptionType {
        NEGATIVE_VALUE, DIFFERENT_QUANTITY_TYPE
    }

    public QuantityException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
