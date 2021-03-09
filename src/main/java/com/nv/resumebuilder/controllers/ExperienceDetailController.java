package com.nv.resumebuilder.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nv.resumebuilder.entity.ExperienceDetail;
import com.nv.resumebuilder.model.ExperienceModel;
import com.nv.resumebuilder.service.ExperienceDetailService;
import com.nv.resumebuilder.service.ProjectService;

@Controller
public class ExperienceDetailController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	private ExperienceDetailService experienceDetailService;
	private ProjectService projectService;

	@Autowired
	public ExperienceDetailController(ExperienceDetailService theExperienceDetailService,
			ProjectService theProjectService) {
		this.experienceDetailService = theExperienceDetailService;
		this.projectService = theProjectService;
	}

	@GetMapping("/experienceDetailForm")
	public String experienceDetail(Model theModel) {

		//model
		ExperienceModel theExperienceProject = new ExperienceModel();

		theModel.addAttribute("experienceproject", theExperienceProject);

		return "experienceDetail";
	}

	@PostMapping("/saveExperienceDetail")
	public String saveExperienceDetail(
			@Valid @ModelAttribute("experienceproject") ExperienceModel theExperienceProject,
			BindingResult theBindingResult,HttpServletRequest request, HttpServletResponse response) {

		if (theBindingResult.hasErrors()) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return "experienceDetail";
		}

		ExperienceDetail experienceDetail = new ExperienceDetail();
		experienceDetail.setcompanyName(theExperienceProject.getCompanyName());
		experienceDetail.setDesignation(theExperienceProject.getDesignation());
		experienceDetail.setJoiningDate(theExperienceProject.getJoiningDate());
		experienceDetail.setLeavingDate(theExperienceProject.getLeavingDate());

		this.experienceDetailService.save(experienceDetail);

		return "redirect:/projectDetails.html?id="+experienceDetail.getExperienceId();
	}

}
