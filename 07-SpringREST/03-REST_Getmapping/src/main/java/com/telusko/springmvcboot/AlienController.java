package com.telusko.springmvcboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.telusko.springmvcboot.model.Alien;


@Controller
public class AlienController {

	@Autowired
	AlienRepo repo;
	
//	@GetMapping("aliens")
//	@ResponseBody
//	public String getAlien() 
//	{
//		List<Alien> aliens  = repo.findAll();		
//		
//		return aliens.toString();    //it will return the data as it is
//	}
	
	@GetMapping("aliens")
	@ResponseBody
	public List<Alien> getAlien() 
	{
		List<Alien> aliens  = repo.findAll();		
		
		return aliens;	//it will return the data in json format
	}
}
