package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.EnggCollege;

public class RequiredAnnontationTest {

	public static void main(String[] args) {

		ApplicationContext context                     =null;
		EnggCollege                  enggCollege        =null;
		
		 //create IOC Container & load XML File in it
		 context =new ClassPathXmlApplicationContext("com/java/cfgs/RequiredAnnontation.xml");
		  
		//get EnggCollge objects from IOC Container
		 enggCollege =context.getBean("reqAnn_dependency",EnggCollege.class);
		 System.out.println("[reqAnn_dependency] enggCollege ------>"+enggCollege);
		 System.out.println();	 
		 
		}
}
