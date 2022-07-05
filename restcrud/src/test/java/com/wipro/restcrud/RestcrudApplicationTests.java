package com.wipro.restcrud;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.wipro.restcrud.entity.Employee;

@SpringBootTest
class RestcrudApplicationTests {

	
		@Autowired
		RestTemplate  restTemplate;
	
			@Autowired
			Employee employee;
		
		@Test
	void  testRestAPI() {
		
	
				employee.setEname("Hemanth Durga");
				employee.setSalary(99000);
		

				
	ResponseEntity<Employee> response =	restTemplate.postForEntity("http://localhost:8080/api/v1/employees/add", employee, Employee.class);
		
	Employee addedEmp =	response.getBody();
	System.out.println(addedEmp);
	
			assertEquals(13, addedEmp.getEname().length());
		
	}

}
