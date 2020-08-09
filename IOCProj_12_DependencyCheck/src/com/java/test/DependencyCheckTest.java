package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.EnggCollege;

public class DependencyCheckTest {

	public static void main(String[] args) {

		ApplicationContext context                     =null;
		EnggCollege                  noneCollege        =null;
		EnggCollege                  simpleCollege     =null;
		EnggCollege                  objectsCollege    =null;
		EnggCollege                  allCollege             =null;
		
		 //create IOC Container & load XML File in it
		 context =new ClassPathXmlApplicationContext("com/java/cfgs/DependencyCheck.xml");
		 
		//get EnggCollge objects from IOC Container
		 System.out.println(".................dependecy-check=*none* ....................{Not required to call any setter methods   [Default]}");
		 noneCollege =context.getBean("none_dependency_Check",EnggCollege.class);
		 System.out.println("[none_dependency_Check]  noneCollege------>"+noneCollege);
		System.out.println();	 
		 
		 System.out.println(".................dependecy-check=*simple *....................{ Required to call simple/primitive value setter methods  }");
		 simpleCollege =context.getBean("simple_dependency_Check",EnggCollege.class);
		 System.out.println("[simple_dependency_Check]simpleCollege------>"+simpleCollege);
		 System.out.println();	
		 
		 System.out.println(".................dependecy-check=*Objects *....................{ Required to call reference/non-primitive value setter methods  }");
		 objectsCollege =context.getBean("objects_dependency_Check",EnggCollege.class);
		 System.out.println("[objects_dependency_Check]objectsCollege------>"+objectsCollege);
		 System.out.println();	
		 
		 System.out.println(".................dependecy-check=*all *....................{ Required to call all setter methods  }");
		 allCollege =context.getBean("all_dependency_Check",EnggCollege.class);
		 System.out.println("[all_dependency_Check]allCollege------>"+allCollege);
		 System.out.println();	
	}
}
