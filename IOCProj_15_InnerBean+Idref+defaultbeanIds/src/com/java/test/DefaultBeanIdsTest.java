package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.HumanBeing;

public class DefaultBeanIdsTest {

	public static void main(String[] args) {

		ApplicationContext context           =null;
		
		//create IOC Container and Load XML File in it
		context        =new ClassPathXmlApplicationContext("com/java/cfgs/DefaultBeanIds.xml");
		
		//get  default bean ids are  from IOC Container
		  for(String beanId :context.getBeanDefinitionNames()){
			  System.out.println("beanId --->"+beanId);
		  }
		
		System.out.println(context.getBean("java.util.Date#0"));
	}

}
