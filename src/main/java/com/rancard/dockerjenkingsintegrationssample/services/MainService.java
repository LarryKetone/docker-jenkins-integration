package com.rancard.dockerjenkingsintegrationssample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    private final SupportService supportService;

    public MainService(SupportService supportService) {
        this.supportService = supportService;
    }

    public int getTestMethod(int i,int j) {

        int ans = supportService.getTestNumeric();
        return ans + j;
    }


}
