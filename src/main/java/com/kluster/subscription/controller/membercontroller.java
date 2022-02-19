package com.kluster.subscription.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class membercontroller {
	
	@GetMapping("/signin")
	public String signin(Model model) {
		model.addAttribute("title","KLUSTER :: 로그인");
		return "user/member/signin";
		
	}
		
}
