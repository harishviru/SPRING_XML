package com.java.beans;

import org.springframework.beans.factory.FactoryBean;

public class AnimalFactory  implements FactoryBean{

	private String animalName;
	
	public void setAnimalName(String animalName) {
		System.out.println("AnimalFactory.setAnimalName()");
		this.animalName = animalName;
	}
	
	@Override
	public Object getObject() throws Exception {
		Animal  animal=null;
            if(animalName.equalsIgnoreCase("cat")){
            	  animal =(Animal) Class.forName("com.java.beans.Cat").newInstance();
            }else if(animalName.equalsIgnoreCase("dog")){
          	        animal =(Animal) Class.forName("com.java.beans.Dog").newInstance();
            }
		return animal;
	}

	@Override
	public Class getObjectType() {
		 System.out.println("AnimalFactory.getObjectType()");
		Class  animal=null;
        if(animalName.equalsIgnoreCase("cat")){
        	  animal =Cat.class;
        }else if(animalName.equalsIgnoreCase("dog")){
      	        animal =Dog.class;
        }
		return animal.getClass();
	}

	@Override
	public boolean isSingleton() {
		System.out.println("AnimalFactory.isSingleton()");
		return true;
	}
	
}
