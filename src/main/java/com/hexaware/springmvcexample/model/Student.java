package com.hexaware.springmvcexample.model;

public class Student {
	
	private int studentId;
	private String studentName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	

}
