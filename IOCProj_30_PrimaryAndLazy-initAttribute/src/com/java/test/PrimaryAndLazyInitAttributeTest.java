package com.java.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.College;

public class PrimaryAndLazyInitAttributeTest {

	public static void main(String[] args) {
		
              AbstractApplicationContext     context                =null;
              College                                          college                 =null;
              
              context =new ClassPathXmlApplicationContext("com/java/cfgs/PrimaryAndLazyInitAttribute.xml");
             
              college =context.getBean("clg",College.class);
           
              System.out.println(college.getStudent());
	}
}
