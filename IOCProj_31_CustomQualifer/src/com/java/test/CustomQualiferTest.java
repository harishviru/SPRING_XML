package com.java.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.College;
import com.java.beans.Person;
import com.java.beans.Pet;

public class CustomQualiferTest {

	public static void main(String[] args) {
		qualiferWithMetaTag();
		System.out.println();
		qualiferInnerElement();
		System.out.println();
       qualiferWithoutAnyMethod();
	
	}
	
	public static void qualiferWithMetaTag(){
		System.out.println("Start**********************CustomQualiferTest.qualiferWithMetaTag()***********************");
        AbstractApplicationContext     context                =null;
        College                                          college                  =null;
        Person                                           person                 =null;
        
        context =new ClassPathXmlApplicationContext("com/java/cfgs/CustomQualiferWithMetaTag.xml");
               
        college=context.getBean("clg",College.class);
        
        person =college.getPerson();
        
        System.out.println("personName---------->"+person.getpName());
        
        System.out.println(person);
		System.out.println("End**********************CustomQualiferTest.qualiferWithMetaTag()***********************");
	}
	public static void qualiferInnerElement(){
		System.out.println("Start**********************CustomQualiferTest.qualiferInnerElement()***********************");
		AbstractApplicationContext     context                =null;
		College                                          college                  =null;
		Person                                           person                 =null;
				
		context =new ClassPathXmlApplicationContext("com/java/cfgs/CustomQualiferWithQualiferInnerElement.xml");
		
		college=context.getBean("clg",College.class);
		
		person =college.getPerson();
		
		System.out.println("personName---------->"+person.getpName());
		
		System.out.println(person);
		System.out.println("End**********************CustomQualiferTest.qualiferInnerElement()***********************");
	}
	public static void qualiferWithoutAnyMethod(){
		System.out.println("Start**********************CustomQualiferTest.qualiferWithoutAnyMethod()***********************");
		AbstractApplicationContext     context                =null;
		Pet                                                    pet                  =null;
		
		context =new ClassPathXmlApplicationContext("com/java/cfgs/CustomQualiferWithoutAnyMethod.xml");
		
		
		pet=context.getBean("pet",Pet.class);
	    pet.getAnimal().name();
		System.out.println("End**********************CustomQualiferTest.qualiferWithoutAnyMethod()***********************");
	}
	
	
	
}
