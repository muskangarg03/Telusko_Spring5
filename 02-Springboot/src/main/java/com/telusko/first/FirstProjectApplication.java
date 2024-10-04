package com.telusko.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		
		//getBean() method belongs to ApplicationContext interface
		
		Alien obj = context.getBean(Alien.class);    //to get the object of Alien class
		obj.code();
		
	}

}
