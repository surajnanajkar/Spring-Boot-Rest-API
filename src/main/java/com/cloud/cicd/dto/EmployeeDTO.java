package com.cloud.cicd.dto;

public class EmployeeDTO {
    Integer id;
    String name;
    String designation;

    public EmployeeDTO(int i, String name, String designation) {
        this.id = i;
        this.name = name;
        this.designation = designation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public  void setDesignation(String designation){
        this.designation = designation;
    }
}

