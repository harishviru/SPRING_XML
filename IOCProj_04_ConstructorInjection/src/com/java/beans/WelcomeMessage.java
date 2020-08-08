package com.java.beans;

/**
 * Here we are using different constructor params
 *
 */
public class WelcomeMessage {

	private String name;
	private int age;
	private String mail;
	private String gender;

	static{
		System.out.println("WelcomeMessage.StaticBlock ..........!");
	}
	
	public WelcomeMessage() {
		System.out.println("WelcomeMessage -0-param constructor");
	}

	public WelcomeMessage(String name) {
		System.out.println("WelcomeMessage -1(string)-param constructor");
		this.name = name;
	}

	public WelcomeMessage(int age) {
		System.out.println("WelcomeMessage -1(int-param)-param constructor");
		this.age = age;
	}

	public WelcomeMessage(String name, int age) {
		System.out.println("WelcomeMessage -2-param constructor");
		this.name = name;
		this.age = age;
	}
	public WelcomeMessage(String name, int age, String mail) {
		System.out.println("WelcomeMessage -3-param constructor");
		this.name = name;
		this.age = age;
		this.mail = mail;
	}
	public WelcomeMessage(String name, int age, String mail, String gender) {
		System.out.println("WelcomeMessage 4-param constructor");
		this.name = name;
		this.age = age;
		this.mail = mail;
		this.gender = gender;
	}

	public void printMsg(){
		System.out.println("name------>"+name);
		System.out.println("age---------->"+age);
		System.out.println("mail---------->"+mail);
		System.out.println("gender---->"+gender);
		
	}
}
