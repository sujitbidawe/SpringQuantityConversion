package com.bl.quantityconversion.service;

import com.bl.quantityconversion.controller.QuantityConversionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

public class QuantityServiceTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    QuantityConversionController quantityConversionController;

//    @Test
//    void whenQuantityConversionGetRequest_shouldReturnListOfQuantity(){
//        mockMvc.perform(quantityConversionController.getQuantityType());
//    }
}
