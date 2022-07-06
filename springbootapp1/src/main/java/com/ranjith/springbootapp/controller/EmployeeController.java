package com.ranjith.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@RequestMapping(value="/hello",method= RequestMethod.GET)
	@ResponseBody
	public String hello() {
		return "Hello";
	}
	@RequestMapping("/display")
	public String displayPage() {
		return "Display";
	}
}
