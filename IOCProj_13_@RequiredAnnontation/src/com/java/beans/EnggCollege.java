package com.java.beans;

import org.springframework.beans.factory.annotation.Required;

public class EnggCollege {

	private String collegeName;
	private Student student;
	
	static{
		System.out.println("EnggCollege. Static Block....!");
	}
	 
	public EnggCollege() {
		System.out.println("EnggCollege. 0-param constructor..!");
	}

	public String getCollegeName() {
		return collegeName;
	}
    @Required
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Student getStudent() {
		return student;
	}
	@Required
	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "EnggCollege [collegeName=" + collegeName + ", student=" + student + "]";
	}
	
}
