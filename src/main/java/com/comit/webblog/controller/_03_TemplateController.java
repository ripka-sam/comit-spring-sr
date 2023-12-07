package com.comit.webblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class _03_TemplateController {

	@GetMapping("/template")
	String template() {
		System.out.println("Hello World!");
		return "welcome";
	}
}
