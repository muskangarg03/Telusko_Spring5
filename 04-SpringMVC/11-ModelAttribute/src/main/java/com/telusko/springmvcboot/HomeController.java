package com.telusko.springmvcboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.springmvcboot.model.Alien;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String home()
	{
		//System.out.println("home page requested");
		return "index";     //It is called by DispatcherServlet
	}
	
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m)
	{
		int num3 = i+j;
		m.addAttribute("num3", num3);
		
		return "result";
	}
	
//	@RequestMapping("addAlien")
//	public String addAlien(@ModelAttribute Alien a) 
//	{
//		m.addAttribute("alien",a);
//		
//		return "result";
//	}
	
	
//	@RequestMapping("addAlien")
//	public String addAlien(@ModelAttribute("a1") Alien a) 
//	{
//		
//		return "result";
//	}
	
	
	@RequestMapping("addAlien")
	public String addAlien(Alien a) 
	{
		return "result";
	}
	
	
	
	
	
//	@RequestMapping("addAlien")
//	public String addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, Model m)
//	{
//		Alien a = new Alien();
//		a.setAid(aid);
//		a.setAname(aname);
//		
//		m.addAttribute("alien",a);
//		
//		
//		return "result";
//	}	
	
}
