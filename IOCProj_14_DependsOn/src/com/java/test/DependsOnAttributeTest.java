package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Flipkart;

public class DependsOnAttributeTest {

	public static void main(String[] args) {

		ApplicationContext context                     =null;
		Flipkart                         flipkart                   =null;
		 //create IOC Container & load XML File in it
		 context =new ClassPathXmlApplicationContext("com/java/cfgs/DependsOnAttribute.xml");
		  
		 //get Flipkart object from IOC Container
		 flipkart=context.getBean("fkrt",Flipkart.class);
		 System.out.println(flipkart);
		 System.out.println();	 
		 
		}
}
