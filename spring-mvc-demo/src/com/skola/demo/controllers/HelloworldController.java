package com.skola.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloworldController {
	
	@RequestMapping("get-form")
	public String getForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("process-form")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("process-form-shout")
	public String shoutStudentName(@RequestParam("studentName") String studentName, Model model) {
		
		String upperCase = studentName.isEmpty() ? "empty".toUpperCase() : studentName.toUpperCase();
				
		model.addAttribute("studentNameUpperCase", upperCase);
		
		return "helloworld";
	}

}
