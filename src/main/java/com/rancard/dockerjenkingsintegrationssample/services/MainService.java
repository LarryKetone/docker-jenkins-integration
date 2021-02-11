package com.rancard.dockerjenkingsintegrationssample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    private final SupportService supportService;

    public MainService(SupportService supportService) {
        this.supportService = supportService;
    }

    public boolean getTestMethod() {
        System.out.println("Good morning my friends!");
        return true;
    }

    public double getTestNumeric() {
        return supportService.support();
    }
}
