package com.cloud.cicd.controller;


import com.cloud.cicd.dto.EmployeeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/getData")
    public ResponseEntity getdata(){
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(1);
        employeeDTO.setName("Ravindra More");
        employeeDTOList.add(employeeDTO);

        employeeDTO = new EmployeeDTO();
        employeeDTO.setId(2);
        employeeDTO.setName("Suraj Nanajkar");
        employeeDTOList.add(employeeDTO);


        return ResponseEntity.ok(employeeDTOList);

    }
}
