package com.nv.resumebuilder.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nv.resumebuilder.entity.EducationalDetailsEntity;

import com.nv.resumebuilder.service.EducationalDetailsService;



@Controller
public class EducationalDetailsController
{

	@Autowired
	private EducationalDetailsService  educationalDetailsService;
	
	@RequestMapping("/education")
	public String education(Model model)
	{
		model.addAttribute("EducationalDetailsEntity", new EducationalDetailsEntity());
		return "educational";
	}

	@RequestMapping(path="/processform" ,method= RequestMethod.POST )
	public String educationFormProcessing(@Valid @ModelAttribute ("EducationalDetailsEntity") EducationalDetailsEntity details,BindingResult result, Model model)
 
	{
		if (result.hasErrors()) 
		{
            return "educational";
        }
		
		educationalDetailsService.educationalDetailsServices(details);  
		model.addAttribute("details1", details);
		System.out.println(details);
		return "redirect:/experienceDetail";
	}

	
}