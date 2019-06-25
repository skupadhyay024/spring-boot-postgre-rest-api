/*package com.school.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.db.StudentRepository;
import com.school.model.Student;

*//**
 * @author javainstance
 *
 *//*
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	private static List<Student> employeeList =new ArrayList<>();
	
	static {
		employeeList.add(new Student(1,"Shashi","HR", "ACTIVE"));
		employeeList.add(new Student(2,"Anita","ADMIN", "ACTIVE"));
		employeeList.add(new Student(3,"Saanvi","TRAVEL", "ACTIVE"));
		employeeList.add(new Student(4,"Prakash","ADMIN", "INACTIVE"));
	}

	@Override
	public List<Student> getEmployees() {
		return studentRepository.findAll();
	}

	@Override
	public Student getEmployee(int id) {
	    return studentRepository.findById(id).get();
	}

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	
	}


}
*/