package com.java.beans;

public class HearBeat {

	private String bloodPressure;
	private String beatPerMin;
	
	static{
		System.out.println("HearBeat. Static Block..........!");
	}
	
	public HearBeat() {
		System.out.println("HearBeat. o-param constructor..!");
	}

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public String getBeatPerMin() {
		return beatPerMin;
	}

	public void setBeatPerMin(String beatPerMin) {
		this.beatPerMin = beatPerMin;
	}

	@Override
	public String toString() {
		return "HearBeat [bloodPressure=" + bloodPressure + ", beatPerMin=" + beatPerMin + "]";
	}
	
}
