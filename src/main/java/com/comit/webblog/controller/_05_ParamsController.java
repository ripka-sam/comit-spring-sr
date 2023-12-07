package com.comit.webblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class _05_ParamsController {

	@GetMapping("/params")
	String hello(HttpServletRequest req,Model model) {
		
		String first = req.getParameter("first");
		String second = req.getParameter("second");
		
		System.out.println("First Parameter: "+ first);
		System.out.println("SecondParameter: "+ second);
		
		model.addAttribute("first", first);
		model.addAttribute("second", second);
		
		return "parameters";
	}
}
