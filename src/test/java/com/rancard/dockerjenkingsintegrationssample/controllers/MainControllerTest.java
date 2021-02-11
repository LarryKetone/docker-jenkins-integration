package com.rancard.dockerjenkingsintegrationssample.controllers;

import com.rancard.dockerjenkingsintegrationssample.services.MainService;
import com.rancard.dockerjenkingsintegrationssample.services.SupportService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = {MainService.class})
class MainControllerTest {

    @Autowired
    private MainService service;

    @MockBean
    private SupportService supportService;

    @Test
    void testMethod(){

      //  assertEquals(1,2);
/*
        double tax = 2 ;

        Mockito.when(supportService.getFigure()).thenReturn(tax);
        assertEquals(tax,service.getTestNumeric());
*/

    }
}
