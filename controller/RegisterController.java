package com.textile_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.textile_app.dao.registerdao;
import com.textile_app.model.register;
import com.textile_app.serviceimpl.registerimpl;




@Controller
public class RegisterController {	
	@Autowired
	registerimpl rdao;
	
	
		

	@RequestMapping(value="register", method=RequestMethod.GET)
	public ModelAndView getLogin(@ModelAttribute("register")register register)
	{
			System.out.println("Register");	
			ModelAndView model=new ModelAndView("register");
			return model;
	}
	
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public ModelAndView Success(register reg, Model m)
	{
			rdao.adduser(reg);
			ModelAndView model=new ModelAndView("login","register", new register());
			return model;
	}
	

	
	
}
	