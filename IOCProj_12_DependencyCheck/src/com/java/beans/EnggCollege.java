package com.java.beans;

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

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "EnggCollege [collegeName=" + collegeName + ", student=" + student + "]";
	}
	
}
