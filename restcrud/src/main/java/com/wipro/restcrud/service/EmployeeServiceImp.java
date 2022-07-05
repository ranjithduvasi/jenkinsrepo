package com.wipro.restcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.restcrud.entity.Employee;
import com.wipro.restcrud.repository.IEmployeeRepository;
@Service
public class EmployeeServiceImp implements IEmployeeService {

		@Autowired
		IEmployeeRepository repo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
	public static boolean  validateEmployee(Employee emp) {
		
			boolean flag = false;
		
			if(emp.getEname().length() > 3 && emp.getSalary() >= 10000)
			{
				
				flag = true;
			
				
			
			}
		
			System.out.println(emp.getEname().length());
			
			
		
		return flag;
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return repo.findById(eid).orElse(new Employee());
	}

	@Override
	public ResponseEntity<String> deleteEmployeeById(int eid) {
	
				repo.deleteById(eid);
		
		
		return new ResponseEntity<String>("Record Deleted Successfully",HttpStatus.ACCEPTED);
	}

	@Override
	public List<Employee> getEmployeeByName(String ename) {
		// TODO Auto-generated method stub
		return repo.findByEname(ename);
	}

	@Override
	public List<Employee> getByGTSalary(double salary) {
		// TODO Auto-generated method stub
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getAllSorted() {
		// TODO Auto-generated method stub
		return repo.findAll(Sort.by(Direction.ASC, "salary"));
	}

	@Override
	public List<Employee> getByNameSalary(String name, double salary) {
		// TODO Auto-generated method stub
		return repo.getByNameSalary(name, salary);
	}

}
