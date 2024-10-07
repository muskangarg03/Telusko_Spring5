package com.telusko.SpringDemo;

public class Alien 
{
	
	private int age;
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Age Assigned");
		this.age = age;
		
	}

	public Alien() {
		System.out.println("Alien Object Created..");
	}
	
	public void code() {
		System.out.println("I am Coding..");
	}

}
