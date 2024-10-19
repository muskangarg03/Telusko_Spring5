package com.telusko.springmvcboot;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect 
{
	@Before("execution(public * com.telusko.springmvcboot.AlienController.getAliens())")
	public void log()
	{
		System.out.println("getAliens method called from Aspect");
	}
}
