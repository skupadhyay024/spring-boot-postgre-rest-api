package com.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.students.db.StudentRepository;
import com.students.model.Student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;

/**
 * @author javainstance
 *
 */
@RestController
public class StudentController {
	
	
	@Autowired
	StudentRepository studentRepository;
	
	@ApiOperation(value = "Get List Of Employees")
	@GetMapping("/students")
	public List<Student> getStudents(){
		return studentRepository.findAll();		
	}
	
	@ApiOperation(value = "Get Student by Id")
	@GetMapping("/student/{studentId}")
	public Student getStudent(@PathVariable int studentId){
		return studentRepository.findById(studentId).get();		
	}
	
	@ApiOperation(value = "Save Employee")
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student){
		return studentRepository.save(student);		
	}

}
