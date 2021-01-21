package com.rancard.dockerjenkingsintegrationssample.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MainController {

    @GetMapping
    public ResponseEntity test (HttpServletRequest request){

        System.out.println("Good morning my neighbours!");
        return new ResponseEntity(HttpStatus.OK);
    }
}
