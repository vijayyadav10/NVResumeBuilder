package com.nv.resumebuilder.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nv.resumebuilder.entity.AchievementsAndHonoursEntity;
import com.nv.resumebuilder.service.AchievementsAndHonoursServices;

@Controller    // this controller is for Achievements Form
public class AchievementsFormController 
{
	@Autowired
    private AchievementsAndHonoursServices achievementsAndHonoursServices; // calling services to store data
	
	@RequestMapping("/AchievementsForm") // form for filling achievements details
	public String achievementsForm(Model model) 
	{
	   model.addAttribute("AchievementsAndHonoursEntity", new AchievementsAndHonoursEntity());
       return "AchievementsForm";
	}
	
	//@RequestMapping(path="/AchievementsFormProcessing" , method = RequestMethod.POST)  // processing the Achievements Form
	@PostMapping(path="/AchievementsFormProcessing")
	public String achievementsFormProcessing(@Valid @ModelAttribute ("AchievementsAndHonoursEntity") AchievementsAndHonoursEntity achievemnetsandhonours,BindingResult result,Model model)
    {
		if (result.hasErrors()) // The BindingResult interface contains the result of validation and also it contains errors that may have occurred. The BindingResult must come right after the model object that is validated
		{
			return "AchievementsForm";
	    }
		else
		{
			achievementsAndHonoursServices.AchievementsAndHonoursStore(achievemnetsandhonours);
			model.addAttribute("achievemnetsandhonours1",achievemnetsandhonours);
	        return "AchievementsFormProcessing";
		}
    }
}
