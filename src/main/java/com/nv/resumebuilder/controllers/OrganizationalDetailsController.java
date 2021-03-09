package com.nv.resumebuilder.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nv.resumebuilder.entity.OrganizationalDetailsEntity;
import com.nv.resumebuilder.service.OrganizationalDetailsService;

@Controller
public class OrganizationalDetailsController {

	@Autowired
	private OrganizationalDetailsService organizationDetailServiceobj;

	public OrganizationalDetailsController(OrganizationalDetailsService organizationDetailServiceobj) {
		super();
		this.organizationDetailServiceobj = organizationDetailServiceobj;
	}

	@GetMapping(value = "/organizationaldetailsform")
	public String orgForm(Model model) {
		model.addAttribute("OrganizationDetailsEntity", new OrganizationalDetailsEntity());
		return "currentorganizationaldetailsform";
	}

	@PostMapping(path = "/adddetails")
	public String orgDetailsAdding(
			@Valid @ModelAttribute("OrganizationDetailsEntity") OrganizationalDetailsEntity organizationDetails,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "currentorganizationaldetailsform";
		} else {
			organizationDetailServiceobj.addorganizationDetailsServices(organizationDetails);
			model.addAttribute("orgDetails", organizationDetails);
			System.out.println(organizationDetails);
			return "AchievementsForm";
		}
	}
}
