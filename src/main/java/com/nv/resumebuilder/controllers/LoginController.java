package com.nv.resumebuilder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.security.Principal;

@Controller
public class LoginController {

	@GetMapping("/")
	public String welcomePage() {
		return "index";
	}

	@RequestMapping(value = "/userLogin")
	public String user(Principal principal, Model model) {

		model.addAttribute("username", principal.getName());
		return "dashboard";
	}

	@GetMapping("/logout")
	public String logOut() {
		return "index";

	}

}
