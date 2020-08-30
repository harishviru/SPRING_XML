package com.java.beans;

public class Teacher extends Person{

	private String tId;
	private String teachName;
	
	public Teacher() {
		System.out.println("Teacher -0-param constructor");
	}

	public String gettId() {
		return tId;
	}

	public void settId(String tId) {
		this.tId = tId;
	}

	public String getTeachName() {
		return teachName;
	}

	public void setTeachName(String teachName) {
		this.teachName = teachName;
	}
	


}
