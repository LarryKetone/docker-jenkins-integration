package com.rancard.dockerjenkingsintegrationssample.controllers;

import com.rancard.dockerjenkingsintegrationssample.models.Customer;
import com.rancard.dockerjenkingsintegrationssample.models.Employee;
import com.rancard.dockerjenkingsintegrationssample.models.Response;
import com.rancard.dockerjenkingsintegrationssample.repositories.CustomerRepository;
import com.rancard.dockerjenkingsintegrationssample.repositories.EmployeeRepository;
import com.rancard.dockerjenkingsintegrationssample.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class MainController {

    private final
    MainService mainService;
    private EmployeeRepository employeeRepository;
    private CustomerRepository customerRepository;

    @Autowired
    public MainController(MainService mainService, EmployeeRepository employeeRepository, CustomerRepository customerRepository) {
        this.mainService = mainService;
        this.employeeRepository = employeeRepository;
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public Response getMain (HttpServletRequest request){

        List<Customer> employees =  customerRepository.findAll();
        return new Response ("records size : " + employees.size(),Boolean.TRUE);
    }


    @PostMapping("/main")
    public Response main(@RequestBody Employee employee){

        employeeRepository.save(employee);
        return new Response(employee.getId() + " inserted!",Boolean.TRUE);
    }

    @GetMapping("/test")
    public Response test (HttpServletRequest request){

        return new Response ("Hello team! This is a test!",Boolean.TRUE);
    }

}
