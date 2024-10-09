package com.telusko.springmvcboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m)
	{
		int num3 = i+j;
		m.addAttribute("num3", num3);
		
		return "result";
	}
	

	
//	@RequestMapping(value="addAlien", method=RequestMethod.POST)	//This @RequestMapping is now specific to POST requests
//	public String addAlien(@ModelAttribute Alien a) 
//	{
//		return "result";
//	}
	
	@PostMapping(value="addAlien")
	public String addAlien(@ModelAttribute Alien a)
	{
		return "result";
	}
	
}
