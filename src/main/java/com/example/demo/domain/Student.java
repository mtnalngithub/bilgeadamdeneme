package com.example.demo.domain;

public class Student {

	private Long id;
	private String name;
	private String surname;
	private String classNumber;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}

	public Student(Long id, String name, String surname, String classNumber) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.classNumber = classNumber;
	}
}
