package com.telusko.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Alien obj = (Alien)factory.getBean("alien"); 	//getBean() method returns a object type, so we need to type-caste it
        obj.code();
    
    }
}
