package com.employee.service;

import java.util.List;

import com.student.model.Employee;

/**
 * @author javainstance
 *
 */
public interface EmployeeService {
	
	public List<Employee> getEmployees();
	
	public Employee getEmployee(int studentId);
	
	public Employee save(Employee student);

}
