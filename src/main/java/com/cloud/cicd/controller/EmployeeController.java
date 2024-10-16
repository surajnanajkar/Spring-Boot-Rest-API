package com.cloud.cicd.controller;


import com.cloud.cicd.dto.EmployeeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/getData")
    public ResponseEntity getdata(){

        List<EmployeeDTO> employeeList = Arrays.asList(
                new EmployeeDTO(1, "Ravindra More", "Lead Consultant - Architect"),
                new EmployeeDTO(2, "Minal Karale", "Senior Consultant - Delivery"),
                new EmployeeDTO(3, "Santosh Mali", "Senior Consultant - Delivery"),
                new EmployeeDTO(4, "Aakash Malpani", "Consultant - Delivery"),
                new EmployeeDTO(4, "Suraj Nanajkar", "Consultant - Delivery")
        );


        return ResponseEntity.ok(employeeList);

    }
}
