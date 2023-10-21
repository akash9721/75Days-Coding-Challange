package com.java.serialization;

import java.io.Serializable;

public class Student implements Serializable{
    private int studentId;
    private String studentName;
    private String email;
    private String college;
    
	public Student(int studentId, String studentName, String email, String college) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
		this.college = college;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", email=" + email + ", college="
				+ college + "]";
	}
    
	
    
}
