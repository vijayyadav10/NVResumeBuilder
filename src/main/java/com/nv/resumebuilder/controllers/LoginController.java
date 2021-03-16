package com.nv.resumebuilder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	public String logOut(HttpServletRequest request) {
		HttpSession httpSession = request.getSession();
		httpSession.removeAttribute("id");
        httpSession.invalidate();
		return "index";

	}

}
