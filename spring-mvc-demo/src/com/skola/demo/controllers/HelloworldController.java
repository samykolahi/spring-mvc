package com.skola.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloworldController {
	
	@RequestMapping("get-form")
	public String getForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("process-form")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/process-form-shout")
	public String shoutStudentName(HttpServletRequest request, Model model) {
		
		String studentName = request.getParameter("studentName");
		
		String upperCase = studentName == null ? "empty".toUpperCase() : studentName.toUpperCase();
				
		model.addAttribute("studentNameUpperCase", upperCase);
		
		return "helloworld";
	}

}
