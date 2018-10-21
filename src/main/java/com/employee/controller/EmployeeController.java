package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.service.EmployeeService;
import com.student.model.Employee;

/**
 * @author javainstance
 *
 */
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getStudents(){
		return employeeService.getEmployees();		
	}
	
	@GetMapping("/employee/{employeeId}")
	public Employee getStudents(@PathVariable int employeeId){
		return employeeService.getEmployee(employeeId);		
	}
	
	@PostMapping("/employee")
	public Employee getStudents(@RequestBody Employee employee){
		return employeeService.save(employee);		
	}

}
