package com.students.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * @author javainstance
 *
 */
@Entity
@Table(name = "student")
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    @Column(name = "name", nullable = false)
	private String name;
	
    @Column(name = "dept", nullable = false)
	private String dept;
	
    @Column(name = "status", nullable = false)
	private String status;

	public Student() {
	
	}

	public Student(int id, String name, String dept, String status) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}	
}
