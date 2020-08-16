package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.DataBaseDriverInfo;

public class PopertyPlacedHolderTest {

	public static void main(String[] args) {
		
              ApplicationContext     context                =null;
              DataBaseDriverInfo    baseDriverInfo   =null;
              
              //get IOC Container and Load XML fIle in it           
              context =new ClassPathXmlApplicationContext("com/java/cfgs/PropertyPlacedHolder.xml");
              
              baseDriverInfo =context.getBean("dbInfo",DataBaseDriverInfo.class);
              
              System.out.println(baseDriverInfo);
	}

}
