package com.java.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class College {

  @Autowired
  @Qualifier("st2")
	private Student student;
	
	public College() {
		System.out.println("College. 0-param constructor");
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}
