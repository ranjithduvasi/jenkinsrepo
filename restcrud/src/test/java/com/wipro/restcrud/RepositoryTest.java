package com.wipro.restcrud;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.wipro.restcrud.entity.Employee;
import com.wipro.restcrud.repository.IEmployeeRepository;
import com.wipro.restcrud.service.IEmployeeService;

@SpringBootTest
public class RepositoryTest {
	
	@Autowired
	IEmployeeRepository repo;
	
	@Autowired
	IEmployeeService service;
	
	@Test
	@Disabled
	public   void  testAddEmployeeRepo() {
		
		Employee empData = new Employee(0, "Tommy", 74000);
		
		Employee employee =	repo.save(empData);
		
		assertEquals(74000, employee.getSalary());
		
	
		
	}
	
	@Test
	@Disabled
	public   void  testEmployeeService() {
		
		
	ResponseEntity<String> response =	service.deleteEmployeeById(77);
		
			assertNotNull(response);
	
	
		//service.getEmployeeById(eid);
	
		
	}
	
	

}
