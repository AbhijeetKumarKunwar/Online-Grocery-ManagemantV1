package com.controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Login;
import com.model.Registration;
import com.service.LoginService;


@Controller
public class ResgistrationController {
	@Autowired
   LoginService service;
	@Autowired
	JdbcTemplate jdbc;
	@RequestMapping(value="/RegistrationForm", method=RequestMethod.GET)
	public String RegistrationFormMethod(@ModelAttribute("id")  Registration r,BindingResult br)
	{ 
		//r=new RegistrationLogin();
		return "RegistrationForm";
	}
		
	@RequestMapping(value="/Result", method=RequestMethod.GET)
	public String RegistrationResult(@ModelAttribute("id") Registration r,BindingResult br,ModelMap model)
	{ 
		//r=new RegistrationLogin();
//		List l=service.retriveData();
//		model.put("list", l);
		//System.out.println(r.getEmail());
		
		Registration rt=service.getDetails("ak0707601@gmail.com");
		model.put("values",rt);
		return "Result";
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String LoginLoad(@ModelAttribute("log")  Login ln,BindingResult br,ModelMap model)
	{ 
		//r=new RegistrationLogin();
//		List l=service.retriveData();
//		model.put("list", l);
		//System.out.println(r.getEmail());
		return "login";
		
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String LoginSub(@ModelAttribute("log") @Valid Login ln,BindingResult br,ModelMap model)
	{ 
		//r=new RegistrationLogin();
//		List l=service.retriveData();
//		model.put("list", l);
		//System.out.println(r.getEmail());
		if(br.hasErrors())
		{
			return "login";
		}
		model.put("email1",ln.getUserName());
		model.put("pasword1", ln.getPassword());
		return "welcome";
		
	}
	
	
	
	
	
	@RequestMapping(value="/RegistrationForm", method=RequestMethod.POST)
	public String RegistrationFormMethod(@ModelAttribute("id") @Valid Registration r,BindingResult re,ModelMap model)
	{
		if(re.hasErrors()){
			return "RegistrationForm";
		}
		int  result=service.addData(r);
		//String result="success";
		
		/*System.out.println(result);*/
		System.out.println("Result:"+result);
//		if(!result.equals("success"))
//		{
//			model.put("message", result);
//			return "welcome";
//		}
//		model.put("message",result);
		if(result == 1)
		{
			System.out.println("Result:"+result);
			model.put("success", "The data is inserted into the data base");
		}
		else
		{
			model.put("success", "The data is not inserted into the data base");
		}
     		return "welcome";
		
	}

}
