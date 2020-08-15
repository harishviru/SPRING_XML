package com.java.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Employee;
import com.java.beans.Mobile;
import com.java.beans.Student;

public class BeanLifeCycleTest {
	
	public static void main(String[] args) {
		
		//Programmatic  Approach
		beanLifeCycleByProgrammaticApproach();
		System.out.println();
		//Declarative  Approach
		beanLifeCycleByDeclarativeApproach();
		System.out.println();
		//Annotation Approach
		beanLifeCycleByAnnotationApproach();		
		
	}
	
	/**
	 * #beanLifeCycleByProgrammaticApproach
	 */
	public static void beanLifeCycleByProgrammaticApproach(){
		System.out.println(" start ......******************Programmatic  Approach ****************************");
		
		AbstractApplicationContext             context  =null;
		Employee                                              emp        =null;
		
		//get IOC Container 
		 context  =new ClassPathXmlApplicationContext("com/java/cfgs/BeanLifeCycleByProgrammaticApproach.xml");
		
		 emp = context.getBean("emp",Employee.class);
		 System.out.println("emp ----->"+emp.getEmpName());
		 
		 context.close();
			System.out.println(" End ......******************Programmatic  Approach ****************************");

	}
	/**
	 * #beanLifeCycleByDeclarativeApproach
	 */
	public static void beanLifeCycleByDeclarativeApproach(){
		System.out.println(" start ......******************Declarative  Approach ****************************");
		
		ConfigurableApplicationContext               context  =null;
		Student                                                           stud        =null;
		
		//get IOC Container 
		context  =new ClassPathXmlApplicationContext("com/java/cfgs/BeanLifeCycleByDeclarativeApproach.xml");
		
		stud = context.getBean("stud",Student.class);
		System.out.println("Student ----->"+stud.getStudName());
		
		context.close();
		System.out.println(" End ......******************Declarative  Approach ****************************");
		
	}
	/**
	 * #beanLifeCycleByAnnotationApproach
	 */
	public static void beanLifeCycleByAnnotationApproach(){
		System.out.println(" start ......******************Annotation  Approach ****************************");
		
		ConfigurableApplicationContext               context   =null;
		Mobile                                                           mobile        =null;
		
		//get IOC Container 
		context  =new ClassPathXmlApplicationContext("com/java/cfgs/BeanLifeCycleByAnnotationApproach.xml");
		
		mobile = context.getBean("mobile",Mobile.class);
		System.out.println("mobile ----->"+mobile);
		
		context.close();
		System.out.println(" End ......******************Annotation  Approach ****************************");
		
	}
	
	
}
