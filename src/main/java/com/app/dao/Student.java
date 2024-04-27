package com.app.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String qualification;
	
	private String result;
	
	public Student() {
		System.out.println("Student() called here"+getClass().getName());
	}

	public Student(int id, String name, String qualification, String result) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.result = result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", qualification=" + qualification + ", result=" + result + "]";
	}

	
	
}
