package com.kluster.subscription.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller



public class controller {
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("title","KLUSTER :: 구독 관리");
		return "main";
	}
		
}
