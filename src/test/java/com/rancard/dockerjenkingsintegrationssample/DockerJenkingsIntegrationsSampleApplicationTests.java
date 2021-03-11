package com.rancard.dockerjenkingsintegrationssample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rancard.dockerjenkingsintegrationssample.models.Employee;
import com.rancard.dockerjenkingsintegrationssample.models.Response;
import com.rancard.dockerjenkingsintegrationssample.services.MainService;
import com.rancard.dockerjenkingsintegrationssample.services.SupportService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class DockerJenkingsIntegrationsSampleApplicationTests {

    @Mock
    MainService mainService;

    @Mock
    SupportService supportService;

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    ObjectMapper objectMapper = new ObjectMapper();


    @BeforeEach
    void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
    }


    @Test
    void addEmployeeTest() throws Exception {
        Employee employee = new Employee();
        employee.setName("Lawrence");
        employee.setDepartment("IT");
        String jsonRequest = objectMapper.writeValueAsString(employee);
        System.out.println(jsonRequest);
        MvcResult mvcResult = mockMvc.perform(post("/main").content(jsonRequest)
        .contentType(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk()).andReturn();
        String resultContent = mvcResult.getResponse().getContentAsString();
        Response response =  objectMapper.readValue(resultContent,Response.class);
        assertTrue(response.isStatus() == Boolean.TRUE);
    }

}
