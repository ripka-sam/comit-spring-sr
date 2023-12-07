package com.comit.webblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class _02_WelcomeController {


	@GetMapping("/welcome")
	@ResponseBody String hello() {
		return "<html>"
			+"<body>"
			+"<h1>Hello World HttpServlet Class Example</h1>"
			+"<a href='https://www.google.com/'>Google</a>"
			+"</body>"
			+"</html>";
	}
}
