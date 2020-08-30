package com.java.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class College {

	@Autowired
	@PersonQualifier(status="active" ,quality="good")
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "College [person=" + person + "]";
	}

}
