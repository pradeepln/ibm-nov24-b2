package com.ibm.training.enums.with;

public class Student {

	private int id;
	private String name;
	private StudentGrade grade;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
//		if(id < 0) {
//			throw new ScoldTheUserException("what is this yaaa...");
//		}
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentGrade getGrade() {
		return grade;
	}
	public void setGrade(StudentGrade grade) {
		this.grade = grade;
	}
	
	
}
