package com.telusko.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");    //configuration file should be present at the location "src/main/java"
    	Alien obj = (Alien)factory.getBean("alien"); 	//getBean() method returns a object type, so we need to type-caste it
        obj.code();
    
    }
}
