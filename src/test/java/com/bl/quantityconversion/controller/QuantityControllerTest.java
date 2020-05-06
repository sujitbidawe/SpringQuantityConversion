package com.bl.quantityconversion.controller;

import com.bl.quantityconversion.service.IQuantityConversionService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.asm.Type.getType;

@SpringBootTest
@AutoConfigureMockMvc
public class QuantityControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    IQuantityConversionService quantityConversionService;
    Gson gson = new Gson();
    List<String> quantity = new ArrayList<>();

    public QuantityControllerTest(){
        this.quantity.add("quantityOne");
        this.quantity.add("quantityTwo");
    }

//    @Test
//    void whenQuantityConversion_GetQuantityRequest_shouldReturnListOfQuantity() throws Exception {
//        when(quantityConversionService.getQuantity()).thenReturn(this.quantity);
//        MvcResult mvcResult = this.mockMvc.perform(get("/conversion")
//                              .contentType(MediaType.APPLICATION_JSON))
//                              .andReturn();
//        String quantityList = mvcResult.getResponse().getContentAsString();
//        List<String> quantity = gson.fromJson(quantityList, new TypeToken<ArrayList<String>>()) {
//        }.getType());
//    }
}
