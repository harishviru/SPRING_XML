package com.java.beans;

public class EnggFaculty {

	private String facultyName;
	private String subject;

	static{
		System.out.println("EnggFaculty. static Block....!");
	}
	
	public EnggFaculty() {
		System.out.println("EnggFaculty. 0-param constructor.......!");
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
