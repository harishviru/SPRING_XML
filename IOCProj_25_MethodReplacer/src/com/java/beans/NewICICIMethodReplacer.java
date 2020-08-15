package com.java.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewICICIMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println(" NewICICIMethodReplacer .............. calInterest logic .....");		
        System.out.println("method :"+method.getName());  
        System.out.println("obj--->"+obj);
        System.out.println("args-->"+args);
		return null;
	}

}
