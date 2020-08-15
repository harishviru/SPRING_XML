package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Car;
import com.java.beans.MotorBike;
import com.java.beans.Truck;

public class LookUpMethodInjectionTest {
	
	public static void main(String[] args) {
	     ApplicationContext     context = null;
         Car                                    car         =null;
         MotorBike                motarBike   =null;
         Truck                          truck            =null;
         
		// get IOC Container
		context = new ClassPathXmlApplicationContext("com/java/cfgs/LookupmethodInjection.xml");

		//get carImp Object from Spring IOC Container
		System.out.println(" **********LookUp method (Using Interface method)*************");
		car =context.getBean("car",Car.class);
		System.out.println(car.getEngine().getEngineName());
		System.out.println("carImp class------->"+car.getClass().getCanonicalName());
		
		System.out.println();
		
		System.out.println(" **********LookUp method (Using abstrat class method)*************");
		motarBike =context.getBean("motarBike",MotorBike.class);
		System.out.println(motarBike.getEngine().getEngineName());
		System.out.println("motarBike class------->"+motarBike.getClass().getCanonicalName());
		
		System.out.println();
		
		System.out.println(" **********LookUp method (Using concrete class method)*************");
		truck =context.getBean("truck",Truck.class);
		System.out.println(truck.getEngine().getEngineName());
		System.out.println("truck class------->"+truck.getClass().getCanonicalName());

	}		
}
