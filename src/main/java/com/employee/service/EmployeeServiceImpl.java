package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.student.model.Employee;

/**
 * @author javainstance
 *
 */
@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	
	private static List<Employee> employeeList =new ArrayList<>();
	
	static {
		employeeList.add(new Employee(1,"Shashi","HR"));
		employeeList.add(new Employee(2,"Anita","ADMIN"));
		employeeList.add(new Employee(3,"Saanvi","TRAVEL"));
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeList;
	}

	@Override
	public Employee getEmployee(int id) {
		return employeeList.get(id+1);
	}

	@Override
	public Employee save(Employee employee) {
		employeeList.add(employee);
		
		return employee;
	}


}
