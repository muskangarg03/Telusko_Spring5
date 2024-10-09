package com.telusko.springmvcboot;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.springmvcboot.model.Alien;

@Controller
public class HomeController 
{
	
	@ModelAttribute       //@ModelAttribute is called first before calling any RequestMapping
	public void modelDaata(Model m)
	{
		m.addAttribute("name", "Aliens");
	}
	
	
	@RequestMapping("/")	//@RequestMapping accepts both get and post requests
	public String home()
	{
		System.out.println("home page requested");
		return "index";     //It is called by DispatcherServlet
	}
	
	
	@GetMapping("getAliens")
	public String getAlien(Model m) 
	{
		List<Alien> aliens = Arrays.asList(new Alien(101, "Navin"), new Alien(102,"Rose"));
//		return aliens.toString();
		m.addAttribute("result",aliens);
		return "showAliens";
	}
	
	
	
	@PostMapping(value="addAlien")
	public String addAlien(@ModelAttribute Alien a)
	{
		return "result";
	}
	
}
