package com.java.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventHandlingTest {

	public static void main(String[] args) {
		
              AbstractApplicationContext     context                =null;
              
              //get IOC Container and Load XML fIle in it           
              context =new ClassPathXmlApplicationContext("com/java/cfgs/EventHandling.xml");
             
              //IOC Start
              context.start();
              
              //IOC Stop
              context.stop();
              
              //IOC Close
              context.close();    
              
              //IOC Refresh
              context.refresh();
	}
}
