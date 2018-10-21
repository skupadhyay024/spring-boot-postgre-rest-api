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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;

/**
 * @author javainstance
 *
 */
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@ApiOperation(value = "Get List Of Employees")
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return employeeService.getEmployees();		
	}
	
	@ApiOperation(value = "Get Employee by Id")
	@GetMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId){
		return employeeService.getEmployee(employeeId);		
	}
	
	@ApiOperation(value = "Save Employee")
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee){
		return employeeService.save(employee);		
	}

}
