package com.rancard.dockerjenkingsintegrationssample.services;

import org.springframework.stereotype.Service;

@Service
public class SupportService {

    public double support(){
        return 4 + getFigure();
    }

    public double getFigure(){
        return 1 ;
    }
}
