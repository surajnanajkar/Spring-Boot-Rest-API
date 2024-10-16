package com.cloud.cicd.controller;

import com.cloud.cicd.dto.EmployeeDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class WebController {

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", "Hello, Team Google!");
        return "greeting";
    }

    @GetMapping("/cloudcid")
    public String cloudCid(Model model) {

        List<EmployeeDTO> employeeList = Arrays.asList(
                new EmployeeDTO(1, "Ravindra More", "Lead Consultant - Architect"),
                new EmployeeDTO(2, "Minal Karale", "Senior Consultant - Delivery"),
                new EmployeeDTO(3, "Santosh Mali", "Senior Consultant - Delivery"),
                new EmployeeDTO(4, "Aakash Malpani", "Consultant - Delivery"),
                new EmployeeDTO(4, "Suraj Nanajkar", "Consultant - Delivery")
        );

        model.addAttribute("employees", employeeList);
        model.addAttribute("message", "Hello, Team Google!");
        return "cloudcid";
    }
}
