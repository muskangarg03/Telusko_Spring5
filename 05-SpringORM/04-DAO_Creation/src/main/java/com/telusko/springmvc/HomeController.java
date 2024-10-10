package com.telusko.springmvc;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.springmvc.dao.AlienDao;
import com.telusko.springmvc.dao.AlienDao;
import com.telusko.springmvc.model.Alien;

@Controller
public class HomeController 
{
	@Autowired
	private AlienDao dao;
	
	@ModelAttribute       //@ModelAttribute is called first before calling any RequestMapping
	public void modelDaata(Model m)
	{
		m.addAttribute("name", "Aliens");
	}
	
	
	@RequestMapping("/")
	public String home()
	{
		//System.out.println("home page requested");
		return "index";     //It is called by DispatcherServlet
	}
	
		
	@Transactional
	@GetMapping("getAliens")
	public String getAlien(Model m) 
	{
		m.addAttribute("result",dao.getAliens());
		return "showAliens";
	}

	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute Alien a) 
	{
		return "result";
	}
	
}
