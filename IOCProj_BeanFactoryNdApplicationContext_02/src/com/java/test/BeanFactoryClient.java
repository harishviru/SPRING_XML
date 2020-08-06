package com.java.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.java.beans.Welcome;

/**
 * These class will explains what is BeanFactory?
 *  i)Bean Factory ---------->Bean instantiation/wiring
 *  ii)Lazy loading of single beans
 * iii)No Support for Automatic BeanPostProcessorregistration ,
 *                                  Automatic BeanFactoryPostProcessorregistrationm,
 *                                   Convenient MessageSource access (fori18n),
 *                                   ApplicationEventpublication.
 */
public class BeanFactoryClient {

	public static void main(String[] args) {	
		// Using Different Path resources.
	   usingClassNdFilePathResources();
	   //using prototype scope
	   diffBeanScopes();
	}
	
	/**  Using Different Path resources.
	 */
	public static void usingClassNdFilePathResources(){
		System.out.println("<------------------------------------------"+Thread.currentThread().getStackTrace()[1].getMethodName()+"------------------------------------->");
		//load XML File
				Resource resource=new ClassPathResource("com/java/cfgs/BeanFactory.xml");	
				//resource=new FileSystemResource("D://SpringXML//IOCProj_BeanFactoryNdApplicationContext_02//src//com//java//cfgs//BeanFactory.xml");
				
				//Create IOC Container & load XML File into container
				BeanFactory factory =new XmlBeanFactory(resource);
				
				//get welcome obj
				Object obj   =factory.getBean("w");//By default singleton scope
				Object obj1 =factory.getBean("w");

				System.out.println("singleton scopes objs are----->");
				System.out.println(obj);
				System.out.println(obj1);
				
				//cast to welcome Class
				Welcome wel =(Welcome)obj;
				wel.sayHello();
	}
	
	/**  Different using bean scopes [By default singleton], we can change to prototype
	 * 
	 */
	public static void diffBeanScopes(){
		System.out.println("<------------------------------------------"+Thread.currentThread().getStackTrace()[1].getMethodName()+"------------------------------------->");
		//load XML File
				Resource resource=new ClassPathResource("com/java/cfgs/BeanFactory.xml");	
				//resource=new FileSystemResource("D://SpringXML//IOCProj_BeanFactoryNdApplicationContext_02//src//com//java//cfgs//BeanFactory.xml");
				
				//Create IOC Container & load XML File into container
				BeanFactory factory =new XmlBeanFactory(resource);
				
				//get welcome obj
				Object obj   =factory.getBean("pw");//By default singleton scope
				Object obj1 =factory.getBean("pw");

				System.out.println("prototype scopes objs are----->");
				System.out.println(obj);
				System.out.println(obj1);
				
				//cast to welcome Class
				Welcome wel =(Welcome)obj;
				wel.sayHello();
	}
}
