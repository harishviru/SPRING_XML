package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.HumanBeing;

public class InnerBeanTest {

	public static void main(String[] args) {

		ApplicationContext context           =null;
		HumanBeing         humanBeing      =null;
		
		//create IOC Container and Load XML File in it
		context        =new ClassPathXmlApplicationContext("com/java/cfgs/InnerBean.xml");
		
		//get HumanBeing object from IOC Container
		humanBeing =context.getBean("hb",HumanBeing.class);
		
		System.out.println(humanBeing);
	
	}

}
