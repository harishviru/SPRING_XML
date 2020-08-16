package com.java.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18NTest {

	public static void main(String[] args) {
		
              ApplicationContext     context                =null;
              String                            message                =null;
              
              //get IOC Container and Load XML fIle in it           
              context =new ClassPathXmlApplicationContext("com/java/cfgs/I18N.xml");
             
              message =context.getMessage("hello.txt",null,Locale.US);         
              System.out.println("US---->"+message);
              System.out.println();
              
              message =context.getMessage("hello.txt",null,Locale.FRENCH);         
              System.out.println("French---->"+message);            
	}
}
