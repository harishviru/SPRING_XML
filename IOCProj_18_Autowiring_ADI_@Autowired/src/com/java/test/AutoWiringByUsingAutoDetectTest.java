package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Student;

public class AutoWiringByUsingAutoDetectTest {

	public static void main(String[] args) {
		
		ApplicationContext context            =null;
		Student                         student         =null; 
		
		//create IOC Container & load XML File in it
		context =new ClassPathXmlApplicationContext("com/java/cfgs/AutoWiringByUsingAutoDetect.xml");
		
		//AutoWiring by using autodetect
		System.out.println("Autowiring by using autodetect...........!");
		student=context.getBean("student",Student.class);
		System.out.println(student);
		System.out.println();
		
	}
}
