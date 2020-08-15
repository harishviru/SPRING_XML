package com.java.beans;

public class CollegeFactory {

	public Student getStudent(){
		 System.out.println("CollegeFactory.getStudent()");
		  Student stud=new Student();
		  stud.setStudName("Harish");
		 return stud;
	}
	
}
