package com.nv.resumebuilder.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
public class ResumeTempletController 
{
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

	@RequestMapping("/resumeFormet") 
	public String achievementsForm(Model model,HttpSession session) 
	{
		PersonalDetailsEntity personalDetails = personalDetailsServices.findById((Long) session.getAttribute("id"));

		PersonalDetailsEntity personalDetailsEntity=personalDetailsServices.findById(personalDetails.getId());
		model.addAttribute("personalDetails",personalDetailsEntity);

		AchievementsAndHonoursEntity achievementsAndHonoursEntity=achievementsAndHonoursServices.findByOtherId(personalDetails.getId());
		model.addAttribute("achievementsAndHonoursDetails",achievementsAndHonoursEntity);

		EducationalDetailsEntity educationalDetailsEntity=educationalDetailsService.findByOtherId(personalDetails.getId());
		model.addAttribute("educationalDetails",educationalDetailsEntity);

		ExperienceDetailsEntity experienceDetailsEntity=experienceDetailService.findByOtherId(personalDetails.getId());        
		model.addAttribute("experienceDetails",experienceDetailsEntity);

	    OrganizationalDetailsEntity organizationalDetailsEntity=organizationalDetailsService.findByOtherId(personalDetails.getId());        
	    model.addAttribute("organizationalDetails",organizationalDetailsEntity);

		ProjectDetailsEntity projectDetailsEntity=projectService.findById(personalDetails.getId());
		model.addAttribute("projectDetails",projectDetailsEntity);

		List<ReferenceDetailsEntity> referenceDetailsEntity=refernceDetailsService.getAllRefernceDetails(personalDetails.getId());
		model.addAttribute("referenceDetails",referenceDetailsEntity);

		return "resumeFormet";
	}
}
