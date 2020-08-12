package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Book;
import com.java.beans.Employee;

public class PandCNameSpaceTest {

	public static void main(String[] args) {
		
		ApplicationContext context            =null;
	    Book                             book              =null;	
		Employee                         emp           =null; 
		Employee                         emp1          =null; 
		
		//create IOC Container & load XML File in it
		context =new ClassPathXmlApplicationContext("com/java/cfgs/P_C_NameSpace.xml");

		//P namespace test
		System.out.println("p namespace...........!");
		book=context.getBean("book",Book.class);
		System.out.println(book);
		
		//C namespace test
		System.out.println("c namespace...........!");
		emp=context.getBean("emp",Employee.class);
		System.out.println(emp);
		
		 System.out.println();
		System.out.println("c namespace........... by using index!");
		emp1=context.getBean("emp1",Employee.class);
		System.out.println(emp1);
		
	}
}
