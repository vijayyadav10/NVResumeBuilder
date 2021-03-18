package com.nv.resumebuilder.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nv.resumebuilder.entity.OrganizationalDetailsEntity;
import com.nv.resumebuilder.entity.PersonalDetailsEntity;
import com.nv.resumebuilder.service.OrganizationalDetailsService;
import com.nv.resumebuilder.service.PersonalDetailsServices;

@Controller
public class OrganizationalDetailsController 
{


	private OrganizationalDetailsService organizationDetailServiceobj;
	private PersonalDetailsServices personalDetailsServices;

	@Autowired
	public OrganizationalDetailsController(OrganizationalDetailsService organizationDetailServiceobj,
			PersonalDetailsServices personalDetailsService) 
	{
		this.organizationDetailServiceobj = organizationDetailServiceobj;
		this.personalDetailsServices = personalDetailsService;
    }

	@GetMapping(value = "/organizationaldetailsform")
	public String orgForm(Model model) 
	{
		model.addAttribute("OrganizationDetailsEntity", new OrganizationalDetailsEntity());
		return "organizationaldetailsform";
	}

	@PostMapping(path = "/adddetails")
	public String orgDetailsAdding(@Valid @ModelAttribute("OrganizationDetailsEntity") OrganizationalDetailsEntity organizationDetails,BindingResult result, Model model,HttpSession session) 
	{
		if (result.hasErrors()) 
		{
			return "organizationaldetailsform";
		} 
		else 
		{
			PersonalDetailsEntity personalDetails = personalDetailsServices.findById((Long) session.getAttribute("id"));
			organizationDetails.setPersonalDetailsEntity(personalDetails);
			organizationDetailServiceobj.addorganizationDetailsServices(organizationDetails);

			model.addAttribute("orgDetails", organizationDetails);
			return "redirect:/AchievementsForm";		
        }
    }
}