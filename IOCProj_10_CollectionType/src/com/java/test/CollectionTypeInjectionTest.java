package com.java.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Employee;
import com.java.beans.EnggCollege;
import com.java.beans.Person;
import com.java.beans.Student;

public class CollectionTypeInjectionTest {

	public static void main(String[] args) {
		       //If IOC Container use DTD schema then default implementation of Collection are(List(I) impl ->ArrayList ,Set(I) impl ->LinkedHashSet,Map(I)--->LinkedHashMap)
                 collectionWithPrimitiveData();
                 collectionWithReferenceData();
                 //Then if we want use Specific Collection Type (Vector,Stack,HashMap...etc)
                collectionWithSpecificTypeByXmlUtilNamespace();
    }
	
	/**
	 *  #collectionWithPrimitiveData
	 */
	public static void collectionWithPrimitiveData(){
		System.out.println("*...Start ......"+Thread.currentThread().getStackTrace()[1].getMethodName()+"....................");
		ApplicationContext context  =null;
		Student stud                             =null;
		Employee  emp                         =null;
		
		
		 //create IOC Container & load XML File in it
		 context=new ClassPathXmlApplicationContext("com/java/cfgs/collectionWithPrimitiveDataTypeInjection.xml");

		   stud=context.getBean("stud",Student.class);
		   System.out.println(stud.getStudIds());
		   System.out.println(stud.getStudNames());
		   System.out.println(stud.getStudSubjMarks());
		 
		   emp=context.getBean("emp",Employee.class);
		   System.out.println(); 
		   Arrays.stream(emp.getEmpNames()).forEach(System.out::println);
		   System.out.println(emp.getEmpIdDesig());
		   
		   System.out.println("Check IOC Container Default Implementation classes are.........!");
		   System.out.println("List (Default Imp)-------->"+stud.getStudNames().getClass());
		   System.out.println("Set (Default Imp)-------->"+stud.getStudIds().getClass());
		   System.out.println("Map (Default Imp)-------->"+stud.getStudSubjMarks().getClass());

		  System.out.println("*...End ......"+Thread.currentThread().getStackTrace()[1].getMethodName()+"....................");
	}
	
	/**
	 * #collectionWithReferenceData
	 */
	public static void collectionWithReferenceData(){
		System.out.println("*...Start ......"+Thread.currentThread().getStackTrace()[1].getMethodName()+"....................");

		ApplicationContext context  =null;
		EnggCollege enggCollege     =null;
		
		 //create IOC Container & load XML File in it
		 context=new ClassPathXmlApplicationContext("com/java/cfgs/collectionWithReferenceDataTypeInjection.xml");

		 enggCollege=context.getBean("enggClg",EnggCollege.class);
		 
		  enggCollege.getEnggFacultyList().forEach(engFc->System.out.println("FacultyName-->"+engFc.getFacultyName() +"  ,FacultySubject--->"+engFc.getSubject()));
	
			System.out.println("*...End ......"+Thread.currentThread().getStackTrace()[1].getMethodName()+"....................");
	}
	/**
	 * #collectionWithSpecificTypeByXmlUtilNamespace
	 */
	public static void collectionWithSpecificTypeByXmlUtilNamespace(){
		System.out.println("*...Start ......"+Thread.currentThread().getStackTrace()[1].getMethodName()+"....................");
		ApplicationContext context  =null;
		Person person                          =null;
		
		 //create IOC Container & load XML File in it
		 context=new ClassPathXmlApplicationContext("com/java/cfgs/collectionWithSpecificTypeByXmlUtilNamespace.xml");

		 person=context.getBean("per",Person.class);
		 
		 System.out.println(person.getFruits());
		 System.out.println(person.getCricketers());
		 System.out.println(person.getCountryCapitals());
		 System.out.println(person.getMydbProps());
		 
		   System.out.println("Check IOC Container  Implementation classes are.........!");
		   System.out.println("Vector -------->"+person.getFruits().getClass());
		   System.out.println("HashSet-------->"+person.getCricketers().getClass());
		   System.out.println("TreeMap-------->"+person.getCountryCapitals().getClass());

		System.out.println("*...End ......"+Thread.currentThread().getStackTrace()[1].getMethodName()+"....................");
	}
	
}
