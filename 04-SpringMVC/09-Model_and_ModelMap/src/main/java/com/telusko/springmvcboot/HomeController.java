package com.telusko.springmvcboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
//	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap m){    //it stores the data in the map format
	{
		int num3 = i+j;
		m.addAttribute("num3", num3);
		
		return "result";
	}
	
	
//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j)
//	{
//		ModelAndView mv = new ModelAndView("result");
//		
//		int num3 = i+j;
//		mv.addObject("num3", num3);
//		
//		return mv;
//	}
	
	

	
	
}
