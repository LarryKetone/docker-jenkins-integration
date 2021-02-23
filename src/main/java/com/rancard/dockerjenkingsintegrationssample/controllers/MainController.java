package com.rancard.dockerjenkingsintegrationssample.controllers;

import com.rancard.dockerjenkingsintegrationssample.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MainController {

    private final
    MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping
    public ResponseEntity test (HttpServletRequest request){

        mainService.getTestMethod();
        return new ResponseEntity("<h1>Hello Jenkins and Docker Boss!</h1>",HttpStatus.OK);
    }
}
