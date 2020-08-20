package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.validation.ValidatingForm;

@Controller
public class HomeController {
	@Autowired 
	private ValidatingForm validatingForm;
	@RequestMapping(value="/home", method =RequestMethod.GET)
	public ModelAndView startingPage(@ModelAttribute("user")StudentForm user) {
		ModelAndView mv =new ModelAndView();
		 mv.addObject("obj",user);
		 mv.setViewName("home1");
		return mv;
	}
	
	@RequestMapping(value="/submitForm",method=RequestMethod.POST)
	public @ResponseBody StudentForm CollectedData(@RequestBody StudentForm user,HttpServletRequest request){
		validatingForm.validatingtheform(user.getName(),user.getAge());
		return user;
	}
	
}
