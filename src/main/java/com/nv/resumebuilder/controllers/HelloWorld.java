package com.nv.resumebuilder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nv.resumebuilder.service.Student;

@Controller
public class HelloWorld {

	@Autowired
	Student student;
	
	@RequestMapping("/resume/person")
	public String display() {
		this.student.display();
		return "persona";
	}
	
	@RequestMapping("/resume/acchivement")
	public String acchivement() {
		return "helloworld";
	}
}
