package com.java.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.java.beans.Welcome;

public class Client {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//load Xml File
		Resource resource=new ClassPathResource("com/java/cfgs/SpringConfig.xml");
		
		//Create IOC Container & load XML File into container
		BeanFactory factory =new XmlBeanFactory(resource);
		
		//get welcome obj
		Object obj=factory.getBean("w");
		
		//cast to welcome Class
		Welcome wel =(Welcome)obj;
		
		wel.sayHello();
		
	}
	
	
}
