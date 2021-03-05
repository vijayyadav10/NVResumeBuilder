package com.nv.resumebuilder.controllers;

import java.util.ArrayList;

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
import com.nv.resumebuilder.entity.Project;
import com.nv.resumebuilder.model.ExperienceProject;
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
		ExperienceProject theExperienceProject = new ExperienceProject();

		theModel.addAttribute("experienceproject", theExperienceProject);

		return "experienceDetail";
	}

	@PostMapping("/saveExperienceDetail")
	public String saveExperienceDetail(
			@Valid @ModelAttribute("experienceproject") ExperienceProject theExperienceProject,
			BindingResult theBindingResult, HttpServletResponse response) {

		if (theBindingResult.hasErrors()) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return "experienceDetail";
		}

		//entity
		ExperienceDetail experienceDetail = new ExperienceDetail();
		experienceDetail.setcompanyName(theExperienceProject.getCompanyName());
		experienceDetail.setDesignation(theExperienceProject.getDesignation());
		experienceDetail.setJoiningDate(theExperienceProject.getJoiningDate());
		experienceDetail.setLeavingDate(theExperienceProject.getLeavingDate());
		ArrayList<Project> projects = new ArrayList();

		//entity
		Project project1 = new Project();

		project1.setProjectName(theExperienceProject.getProjectName());
		project1.setProjectDescription(theExperienceProject.getProjectDescription());
		project1.setExperienceDetail(experienceDetail);

		projects.add(project1);

		experienceDetail.setProjects(projects);

		this.experienceDetailService.save(experienceDetail);
		this.projectService.save(project1);

		return "redirect:/experienceDetailForm";
	}

}
