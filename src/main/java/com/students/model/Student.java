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
	
    @Column(name = "address", nullable = false)
	private String address;
	
    @Column(name = "phoneNumber", nullable = false)
	private String phoneNumber;

	public Student() {
	
	}



	public Student(int id, String name, String address, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}



	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}



	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}


}
