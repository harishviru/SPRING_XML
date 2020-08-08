package com.java.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;
	
	static{
		System.out.println("WishMessageGenerator.StaticBlock ..........!");
	}
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator. 0-param constructor");
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate() method");
		this.date = date;
	}

	public String generateWishMessage(String uName){
		System.out.println("*--start--------------------"+Thread.currentThread().getStackTrace()[1].getMethodName()+"---------------------------------*");
		   int hour=0;
		   String wishMsg="";
	    	hour= date.getHours();   //get current hour of the day
	    	 System.out.println("hour----------->"+hour);
		     if(hour<12){
		    	 wishMsg= "Good morning....."+uName;
		     }else if(hour<16){
		    	 wishMsg= "Good Afternoon....."+uName;
		     }else if(hour<20){
		    	 wishMsg ="Good evening....."+uName;
		     }else{
		    	 wishMsg= "Good Night....."+uName;
		     }
				System.out.println("*--End--------------------"+Thread.currentThread().getStackTrace()[1].getMethodName()+"---------------------------------*");
	            return wishMsg;
	}
	
}
