package com.rancard.dockerjenkingsintegrationssample.controllers;

import com.rancard.dockerjenkingsintegrationssample.models.Employee;
import com.rancard.dockerjenkingsintegrationssample.models.Response;
import com.rancard.dockerjenkingsintegrationssample.repositories.EmployeeRepository;
import com.rancard.dockerjenkingsintegrationssample.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MainController {

    private final
    MainService mainService;
    private EmployeeRepository employeeRepository;

    @Autowired
    public MainController(MainService mainService, EmployeeRepository employeeRepository) {
        this.mainService = mainService;
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public ResponseEntity test (HttpServletRequest request){

        return new ResponseEntity("<h1>Hello Jenkins and Docker. It works!</h1>",HttpStatus.OK);
    }


    @PostMapping("/main")
    public Response main(@RequestBody Employee employee){

        employeeRepository.save(employee);
        return new Response(employee.getId() + " inserted!",Boolean.TRUE);
    }

}
