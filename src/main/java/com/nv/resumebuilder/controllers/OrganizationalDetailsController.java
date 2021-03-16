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
public class OrganizationalDetailsController {

	private OrganizationalDetailsService organizationDetailService;
	private PersonalDetailsServices personalDetailsService;

	@Autowired
	public OrganizationalDetailsController(OrganizationalDetailsService organizationDetailServiceobj,
			PersonalDetailsServices personalDetailsService) {
		this.organizationDetailService = organizationDetailServiceobj;
		this.personalDetailsService = personalDetailsService;

	}

	public OrganizationalDetailsController(OrganizationalDetailsService organizationDetailServiceobj2) {

	}

	@GetMapping(value = "/organizationaldetailsform")
	public String orgForm(Model model) {
		model.addAttribute("OrganizationDetailsEntity", new OrganizationalDetailsEntity());
		return "organizationaldetailsform";
	}

	@PostMapping(path = "/adddetails")
	public String orgDetailsAdding(
			@Valid @ModelAttribute("OrganizationDetailsEntity") OrganizationalDetailsEntity organizationalDetailsEntity,
			BindingResult result, Model model, HttpSession session) {
		if (result.hasErrors()) {
			return "organizationaldetailsform";
		}
		PersonalDetailsEntity personalDetails = this.personalDetailsService.findById((Long) session.getAttribute("id"));
		organizationalDetailsEntity.setPersonalDetailsEntity(personalDetails);

		organizationDetailService.addorganizationDetailsServices(organizationalDetailsEntity);
		model.addAttribute("orgDetails", organizationalDetailsEntity);
		System.out.println(".........."+organizationalDetailsEntity);
		// return "redirect:/AchievementsForm";
		return "ResumeFormat";
	}
}
