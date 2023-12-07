package com.comit.webblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class _01_HelloController {

	@GetMapping("/hello")
	@ResponseBody String hello() {
		return "Hello";
	}
}
