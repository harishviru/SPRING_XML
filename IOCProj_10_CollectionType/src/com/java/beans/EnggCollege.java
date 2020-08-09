package com.java.beans;

import java.util.List;

public class EnggCollege {

	private List<EnggFaculty> enggFacultyList;
	
	static{
		System.out.println("EnggCollege. static Block....!");
	}
	
	public EnggCollege() {
		System.out.println("EnggCollege. o-param constructor....!");
	}

	public List<EnggFaculty> getEnggFacultyList() {
		return enggFacultyList;
	}

	public void setEnggFacultyList(List<EnggFaculty> enggFacultyList) {
		this.enggFacultyList = enggFacultyList;
	}

	
	
}
