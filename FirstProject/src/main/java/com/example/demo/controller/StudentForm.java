package com.example.demo.controller;

public class StudentForm {
	public String name;
	public int age;
	public String branch;
	public StudentForm(String name, int age, String branch) {
		super();
		this.name = name;
		this.age = age;
		this.branch = branch;
	}
	public StudentForm() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
	
}
