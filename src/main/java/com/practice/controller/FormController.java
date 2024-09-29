package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.entities.LoginData;

@Controller
public class FormController {

	@GetMapping("/form")
	public String openForm(Model model) {
        System.out.println("In openForm");
		model.addAttribute("LoginData", new LoginData());
		return "form";
	}
	
	@PostMapping("/process")
	public String processForm(@jakarta.validation.Valid  @ModelAttribute("LoginData") LoginData loginData, BindingResult result) {
		
		System.out.println(loginData);
		
		if(result.hasErrors()) {
			
		   System.out.println(result);
		   return "form";
		}
		
		
		return "success";
		
	}
}
