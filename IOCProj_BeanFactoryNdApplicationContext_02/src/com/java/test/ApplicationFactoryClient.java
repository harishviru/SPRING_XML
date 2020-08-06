package com.java.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.java.beans.Welcome;

/**
 * These class will explains what is ApplicationFactory?
 *  i)ApplicationContext Factory ---------->Bean instantiation/wiring      
 *  ii)Early loading of single beans
 * iii) Support for Automatic BeanPostProcessorregistration ,
 *                                  Automatic BeanFactoryPostProcessorregistrationm,
 *                                   Convenient MessageSource access (fori18n),
 *                                   ApplicationEventpublication.
 */
public class ApplicationFactoryClient {

	public static void main(String[] args) {
         usingClassNdFilePathResources();
         diffBeanScopes();
	}

	/**  Using Different Path resources.
	 * 
	 */
	public static void usingClassNdFilePathResources(){
	    	System.out.println("<------------------------------------------"+Thread.currentThread().getStackTrace()[1].getMethodName()+"------------------------------------->");
				//Create IOC Container & load XML File into container
				ApplicationContext factory =new ClassPathXmlApplicationContext("com/java/cfgs/ApplicationFactory.xml");
				//factory=new FileSystemXmlApplicationContext("D://SpringXML//IOCProj_BeanFactoryNdApplicationContext_02//src//com//java//cfgs//ApplicationFactory.xml");		
	           System.out.println();
	}
	
	/**  Different using bean scopes [By default singleton], we can change to prototype
	 * 
	 */
	public static void diffBeanScopes(){
		System.out.println("<------------------------------------------"+Thread.currentThread().getStackTrace()[1].getMethodName()+"------------------------------------->");
	     	//Create IOC Container & load XML File into container
		    ApplicationContext factory =new ClassPathXmlApplicationContext("com/java/cfgs/ApplicationFactory.xml");
				
				//get welcome obj
				Object obj    =factory.getBean("w");//By default singleton scope
				Object obj0  =factory.getBean("w");
				System.out.println("singleton scope .........................................");

				System.out.println(obj);
				System.out.println(obj0);
				System.out.println();
				Object obj1 =factory.getBean("pw");
				Object obj2 =factory.getBean("pw");
				System.out.println("prototype scope .........................................");

				System.out.println(obj1);
				System.out.println(obj2);

				//cast to welcome Class
				Welcome wel =(Welcome)obj;
				wel.sayHello();
				System.out.println();
	}
}
