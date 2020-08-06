package com.java.test;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.java.beans.WishMessage;

public class SetterInjectionTest {

	public static void main(String[] args) {
		//load XML File 
		Resource resource=new ClassPathResource("com/java/cfgs/SetterInjection.xml");
		
		//create IOC Container and load XML File in it
		BeanFactory factory =new XmlBeanFactory(resource);
		
		//get WishMessage Object from IOC Container by getBean("") method
		  Object obj = factory.getBean("wish");	
		  
		  //Cast to WishGenerator
		  WishMessage message=(WishMessage)obj;
		  
		  //call method
		 System.out.println(message.getMessage());
		 
		// getDefaultBehaviourOfIOCBeanCreation();
	}
	
	
	/**
	 * Get Default bean creation  values of IOC Container
	 */
	public static void getDefaultBehaviourOfIOCBeanCreation(){
		//load XML File 
				Resource resource=new ClassPathResource("com/java/cfgs/SetterInjection.xml");
				
				//create IOC Container and load XML File in it
				DefaultListableBeanFactory factory =new XmlBeanFactory(resource);
											
				Field field;
				try {
					field = DefaultListableBeanFactory.class.getDeclaredField("beanDefinitionMap");
					field.setAccessible(true);
					 Map<String, BeanDefinition>  mapData = (Map<String, BeanDefinition> ) field.get(factory); //IllegalAccessException
					 
					 Iterator<Entry<String, BeanDefinition>> iterator = mapData.entrySet().iterator();	 
					 while(iterator.hasNext()){
						 Entry<String, BeanDefinition> entry = iterator.next();
						 System.out.println(entry.getKey() +"------------"+entry.getValue());
					 }	 
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
	
}
