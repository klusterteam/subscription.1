package com.kluster.subscription.controller;

import com.kluster.subscription.domain.Service;
import com.kluster.subscription.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

	private final MainService mainService;

	public MainController(MainService mainService) {
		this.mainService = mainService;
	}

	@GetMapping("/")
	/*메인 화면 + 초기 화면에 표출되는 구독 서비스 리스트*/
	public String main(Model model) {

		List<Service> mainServiceList = mainService.getMainServiceList();

		System.out.println(mainServiceList);

		model.addAttribute("mainServiceList",mainServiceList);
		model.addAttribute("title","KLUSTER Project #1 구독 관리 시스템");
		return "main";
	}
		
}
