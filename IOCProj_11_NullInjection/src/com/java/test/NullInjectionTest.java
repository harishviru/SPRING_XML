package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Employee;

public class NullInjectionTest {

	public static void main(String[] args) {

		ApplicationContext context =null;
		Employee                    emp1    =null;
		Employee                    emp2    =null;
		
		 //create IOC Container & load XML File in it
		 context =new ClassPathXmlApplicationContext("com/java/cfgs/NullInjection.xml");
		 
		//get Employee objects from IOC Container
		 emp1      =context.getBean("emp1", Employee.class);
         System.out.println("empId         :"+emp1.getEmpId());	 
         System.out.println("empName  : "+emp1.getEmpName());	 
         System.out.println("empAddress: "+emp1.getEmpAddress());	 
         System.out.println();
		 emp2      =context.getBean("emp2", Employee.class);
		  System.out.println("empId         :"+emp2.getEmpId());	 
	      System.out.println("empName  : "+emp2.getEmpName());	 
	      System.out.println("empAddress: "+emp2.getEmpAddress());	 
	}
}
