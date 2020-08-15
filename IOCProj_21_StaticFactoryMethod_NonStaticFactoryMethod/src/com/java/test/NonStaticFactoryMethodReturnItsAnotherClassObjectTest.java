package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Student;

public class NonStaticFactoryMethodReturnItsAnotherClassObjectTest {

	public static void main(String[] args) {
		
		ApplicationContext         context       =null;
		Student                             student         =null;
		
		//get IOC Container and load XML File in it
		context =new ClassPathXmlApplicationContext("com/java/cfgs/NonStaticFactoryMethodReturnItsAnotherClassObject.xml");		
		
		//get Student class object
		student =context.getBean("stud",Student.class);
		
		System.out.println(student.getStudName());

	}
}
