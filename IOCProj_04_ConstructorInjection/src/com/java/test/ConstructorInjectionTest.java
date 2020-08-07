package com.java.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.java.beans.WelcomeMessage;
import com.java.beans.WishMessage;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		constructorInjectionOfOneParam();
		constructorInjectionOfOne0rMoreParam();
		constructorInjectionOfOne0rMoreParamUsingIndexorTypeAttribute();
	}

	
	public static void constructorInjectionOfOneParam(){
		System.out.println("*----start----------------------------"+Thread.currentThread().getStackTrace()[1].getMethodName()+"------------------------------*");
		//load XML File 
				Resource resource=new ClassPathResource("com/java/cfgs/ConstructorInjection.xml");
				
				//create IOC Container and load XML File in it
				BeanFactory factory =new XmlBeanFactory(resource);
				
				//get WishMessage Object from IOC Container by getBean("") method
				  Object obj = factory.getBean("wish");	
				  
				  //Cast to WishGenerator
				  WishMessage message=(WishMessage)obj;
				  
				  //call method
				 System.out.println(message.getMessage());
			    System.out.println("*----End----------------------------"+Thread.currentThread().getStackTrace()[1].getMethodName()+"------------------------------*");
			    System.out.println();
	}
	public static void constructorInjectionOfOne0rMoreParam(){
		System.out.println("*----start----------------------------"+Thread.currentThread().getStackTrace()[1].getMethodName()+"------------------------------*");
		//load XML File 
				Resource resource=new ClassPathResource("com/java/cfgs/ConstructorInjection.xml");
				
				//create IOC Container and load XML File in it
				BeanFactory factory =new XmlBeanFactory(resource);
				
				//get WelcomeMessage Object from IOC Container by getBean("") method
				WelcomeMessage param_0 = factory.getBean("wel_oparam",WelcomeMessage.class);	
				WelcomeMessage param_1 = factory.getBean("wel_1param",WelcomeMessage.class);	
				WelcomeMessage param_2 = factory.getBean("wel_2param",WelcomeMessage.class);	
				WelcomeMessage param_3 = factory.getBean("wel_3param",WelcomeMessage.class);	
				WelcomeMessage param_4 = factory.getBean("wel_4param",WelcomeMessage.class);	
				System.out.println("param_0------------->"+param_0);
				System.out.println("param_1------------->"+param_1);
				System.out.println("param_2------------->"+param_2);
				System.out.println("param_3------------->"+param_3);
				System.out.println("param_4------------->"+param_4);

				System.out.println("*----End----------------------------"+Thread.currentThread().getStackTrace()[1].getMethodName()+"------------------------------*");
				System.out.println();
	}
	
	public static void constructorInjectionOfOne0rMoreParamUsingIndexorTypeAttribute(){
		System.out.println("*----start----------------------------"+Thread.currentThread().getStackTrace()[1].getMethodName()+"------------------------------*");
		//load XML File 
				Resource resource=new ClassPathResource("com/java/cfgs/ConstructorInjection.xml");
				
				//create IOC Container and load XML File in it
				BeanFactory factory =new XmlBeanFactory(resource);
				
				//get WelcomeMessage Object from IOC Container by getBean("") method
				WelcomeMessage param_0 = factory.getBean("wel_Index_attr",WelcomeMessage.class);	
				WelcomeMessage param_1 = factory.getBean("wel_type_attr",WelcomeMessage.class);	
				System.out.println("*----End----------------------------"+Thread.currentThread().getStackTrace()[1].getMethodName()+"------------------------------*");
				System.out.println();
	}
}
