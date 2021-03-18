package com.nv.resumebuilder.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nv.resumebuilder.entity.AchievementsAndHonoursEntity;
import com.nv.resumebuilder.entity.EducationalDetailsEntity;
import com.nv.resumebuilder.entity.ExperienceDetailsEntity;
import com.nv.resumebuilder.entity.OrganizationalDetailsEntity;
import com.nv.resumebuilder.entity.PersonalDetailsEntity;
import com.nv.resumebuilder.entity.ProjectDetailsEntity;
import com.nv.resumebuilder.entity.ReferenceDetailsEntity;
import com.nv.resumebuilder.service.AchievementsAndHonoursServices;
import com.nv.resumebuilder.service.EducationalDetailsService;
import com.nv.resumebuilder.service.ExperienceDetailService;
import com.nv.resumebuilder.service.OrganizationalDetailsService;
import com.nv.resumebuilder.service.PersonalDetailsServices;
import com.nv.resumebuilder.service.ProjectService;
import com.nv.resumebuilder.service.RefernceDetailsService;

@Controller
public class ResumeTemplateController {
	@Autowired
	private PersonalDetailsServices personalDetailsServices;

	@Autowired
	private AchievementsAndHonoursServices achievementsAndHonoursServices; 

	@Autowired
	private EducationalDetailsService educationalDetailsService;

	@Autowired
	private ExperienceDetailService experienceDetailService;

	@Autowired
	private OrganizationalDetailsService organizationalDetailsService;

	@Autowired
	private ProjectService projectService;

	@Autowired
	private RefernceDetailsService refernceDetailsService;

	
		@GetMapping("/preview")
		private String downloadResume(HttpSession session, Model model) {
		// personal details
		Long idAttribute = (Long) session.getAttribute("id");
		PersonalDetailsEntity personalDetails = null;

		if (idAttribute == null) {
		model.addAttribute("Error", "Please Fill the form");
		return "redirect:/personalDetails";
		}

		personalDetails = this.personalDetailsServices.findById(idAttribute);
		model.addAttribute("personalDetails", personalDetails);

		// Education details
		EducationalDetailsEntity educationalDetails = educationalDetailsService.findByPersonId(idAttribute);
		model.addAttribute("educationalDetails", educationalDetails);

		// organizational details
		OrganizationalDetailsEntity organizationalDetailsEntity = organizationalDetailsService
		.findByOtherId(idAttribute);
		model.addAttribute("organizationalDetails", organizationalDetailsEntity);

		// Experience details
		ExperienceDetailsEntity experienceDetailsEntity = experienceDetailService.findByOtherId(idAttribute);
		model.addAttribute("experienceDetails", experienceDetailsEntity);

		List<ProjectDetailsEntity> projectDetailsEntity = projectService
		.findById(experienceDetailsEntity.getExperienceId());
		model.addAttribute("projectDetails", projectDetailsEntity);

		// achievments and honours details
		AchievementsAndHonoursEntity achievementsAndHonours = achievementsAndHonoursServices
		.findBYPersonId(idAttribute);
		model.addAttribute("achievementsAndHonours", achievementsAndHonours);

		// Reference Details
		List<ReferenceDetailsEntity> refernceDetailsdata = refernceDetailsService.getAllRefernceDetails(idAttribute);
		model.addAttribute("refernceDetailsdata", refernceDetailsdata);

		return "resumeFormet";
		}
		
		
	}


