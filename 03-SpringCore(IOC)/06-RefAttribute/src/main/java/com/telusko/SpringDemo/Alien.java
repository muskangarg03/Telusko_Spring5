package com.telusko.SpringDemo;

public class Alien 
{
	
	private int age;
	private Laptop laptop;

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

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
		laptop.compile();
	}

}
