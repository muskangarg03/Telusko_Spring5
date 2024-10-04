package com.telusko.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component           //It Marks a class as a Spring-managed component (bean) for dependency injection
public class Alien {

	@Autowired		//Used for injecting dependencies automatically by Spring
	Laptop lap;
	
	public void code()
	{
		//System.out.println("I am Coding..");
		lap.compile();
	}
	
}
