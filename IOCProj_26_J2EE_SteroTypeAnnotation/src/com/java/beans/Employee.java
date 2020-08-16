package com.java.beans;

import javax.annotation.Resource;
import javax.inject.Inject;

public class Employee {

	private String id;
	private String name;

	@Inject                                       //ByName     
	private Company company;
	@Resource                                //ByName
	private  Address address;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
       public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", address=" + address + "]";
	}

       
}