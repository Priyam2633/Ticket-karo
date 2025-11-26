package com.jsp.Ticket_Karo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@GetMapping("/")
	public String Home()
	{
		return "Home.html";
	}
}
