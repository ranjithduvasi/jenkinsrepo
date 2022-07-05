package com.wipro.restcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.restcrud.entity.Employee;
@Repository
public interface IEmployeeRepository  extends JpaRepository<Employee,Integer> {

		public  List<Employee>   findByEname(String ename);
		
		public List<Employee>  findBySalaryGreaterThan(double salary);
		
		
@Query("select e  from Employee e  where ename = ?1 and salary = ?2")
public List<Employee>  getByNameSalary(String name,double salary);
		
		

}
