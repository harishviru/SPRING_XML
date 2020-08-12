package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Book;

public class BeanInheritanceViaSetterInjectionTest {

	public static void main(String[] args) {
		
		ApplicationContext context           =null;
	    Book                             book             =null;	
		
		//create IOC Container & load XML File in it
		context =new ClassPathXmlApplicationContext("com/java/cfgs/BeanInheritanceViaSetterInjection.xml");

		// Bean inheritance without template (abstract="false") 
		book=context.getBean("baseBook",Book.class);
		System.out.println("baseBook---->"+book);
		
		book=context.getBean("craigBook",Book.class);
		System.out.println("craigBook---->"+book);
		
		book=context.getBean("JulieBook",Book.class);
		System.out.println("JulieBook---->"+book);
		System.out.println();
		
		//Bean inheritance with template (abstract="true") 		
		book=context.getBean("jamieBook",Book.class);
		System.out.println("jamieBook---->"+book);
		
		book=context.getBean("allenBook",Book.class);
		System.out.println("allenBook---->"+book);

	}
	
}
