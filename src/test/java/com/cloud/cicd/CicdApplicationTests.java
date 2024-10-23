package com.cloud.cicd;

import com.cloud.cicd.controller.EmployeeController;
import com.cloud.cicd.dto.EmployeeDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CicdApplicationTests {

	@Autowired
	private EmployeeController employeeController;

	@Test
	void contextLoads() {

		List<EmployeeDTO> employeeDTOList = (List<EmployeeDTO>) employeeController.getdata().getBody();
		Assertions.assertEquals(6, employeeDTOList.size());
		Assertions.assertEquals("Ravindra More", employeeDTOList.get(0).getName());
		Assertions.assertEquals("Suraj Nanajkar", employeeDTOList.get(4).getName());
	}

}
