package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.ICICIBank;

public class MethodReplacerTest {
	
	public static void main(String[] args) {
	     ApplicationContext     context = null;
         ICICIBank                       bank      =null;  
	     
		// get IOC Container
		context = new ClassPathXmlApplicationContext("com/java/cfgs/MethodReplacer.xml");

		//get ICICIBank Object from Spring IOC Container
		bank =context.getBean("bank",ICICIBank.class);
		
		bank.deposit();
		bank.withDraw();
		bank.calInterest(); //Replacing New Method logic	
	}		
}
