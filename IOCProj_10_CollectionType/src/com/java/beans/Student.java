package com.java.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private List studNames;
	private Set studIds;
	private Map studSubjMarks;
	
	static{
		System.out.println("Student. Static Block.....!");
	}
	
	public Student() {
		System.out.println("Student. 0-param constructor");
	}

	public List getStudNames() {
		return studNames;
	}

	public void setStudNames(List studNames) {
		this.studNames = studNames;
	}

	public Set getStudIds() {
		return studIds;
	}

	public void setStudIds(Set studIds) {
		this.studIds = studIds;
	}

	public Map getStudSubjMarks() {
		return studSubjMarks;
	}

	public void setStudSubjMarks(Map studSubjMarks) {
		this.studSubjMarks = studSubjMarks;
	}
	
}
