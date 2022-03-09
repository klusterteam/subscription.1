package com.kluster.subscription.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mySubController {
	@GetMapping("/mySubscription")
	public String mySubMain(Model model) {
		model.addAttribute("title","KLUSTER :: 내 구독 현황");
		return "mySubscription";
	}
}
