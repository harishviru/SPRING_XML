package com.java.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *#Annotation Approach    
 *
 */
public class Mobile {

	private String mobileComp;
	private int       ram;
	private int     rom;
	
   public void setMobileComp(String mobileComp) {
	   System.out.println("Mobile.setMobileComp()");
		this.mobileComp = mobileComp;
	}
	public void setRam(int ram) {
		System.out.println("Mobile.setRam()");
		this.ram = ram;
	}
	public void setRom(int rom) {
		System.out.println("Mobile.setRom()");
		this.rom = rom;
	}

	@PostConstruct
	public void myInit() throws Exception {
		System.out.println("aftersetting properties.................Mobile.myInit()");
	}

	@PreDestroy
	public void myDestroy() throws Exception {
		System.out.println("Mobile.myDestroy()");
	}
	@Override
	public String toString() {
		return "Mobile [mobileComp=" + mobileComp + ", ram=" + ram + ", rom=" + rom + "]";
	}
}
