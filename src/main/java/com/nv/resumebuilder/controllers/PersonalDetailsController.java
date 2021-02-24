package com.nv.resumebuilder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nv.resumebuilder.entity.PersonalDetailsEntity;
import com.nv.resumebuilder.model.PersonalDetails;
import com.nv.resumebuilder.service.PersonalDetailsServices;

@Controller
public class PersonalDetailsController
{
	@Autowired
    private PersonalDetailsServices  personalDetailsServices;// calling services to store data
	
	@RequestMapping("/personalDetails")
	public String personalDetailsForm() 
	{
		
		return "personalDetails";
	}
	
	@RequestMapping(path="/PersonalDetailsProcessing" , method = RequestMethod.POST)// processing the personal details Form
	public String personalDetailsProcessing(@ModelAttribute PersonalDetails personalDetails,Model model )
	{
       // personalDetailsServices.personalDetailsStore(personalDetails);
        model.addAttribute("personaldetails1",personalDetails);
        System.out.println(personalDetails);
        return "PersonalDetailsProcessing";
	}
}
