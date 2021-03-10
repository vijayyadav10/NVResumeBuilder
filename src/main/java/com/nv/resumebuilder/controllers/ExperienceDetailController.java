package com.nv.resumebuilder.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

import com.nv.resumebuilder.entity.ExperienceDetailsEntity;
import com.nv.resumebuilder.entity.PersonalDetailsEntity;
import com.nv.resumebuilder.model.ExperienceModel;
import com.nv.resumebuilder.repository.ExperienceDetailRepository;
import com.nv.resumebuilder.service.ExperienceDetailService;
import com.nv.resumebuilder.service.PersonalDetailsServices;

@Controller
public class ExperienceDetailController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	private ExperienceDetailService experienceDetailService;
	private PersonalDetailsServices personalDetailsServices;

	@Autowired
	public ExperienceDetailController(ExperienceDetailService theExperienceDetailService,
			PersonalDetailsServices thePersonalDetailsServices,
			ExperienceDetailRepository theExperienceDetailRepository) {
		this.experienceDetailService = theExperienceDetailService;
		this.personalDetailsServices = thePersonalDetailsServices;
	}

	@GetMapping("/experienceDetailForm")
	public String experienceDetail(Model theModel) {

		// model
		ExperienceModel theExperienceProject = new ExperienceModel();

		theModel.addAttribute("experienceproject", theExperienceProject);

		return "experienceDetail";
	}

	@PostMapping("/saveExperienceDetail")
	public String saveExperienceDetail(@Valid @ModelAttribute("experienceproject") ExperienceModel theExperienceProject,
			BindingResult theBindingResult, HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {

		if (theBindingResult.hasErrors()) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return "experienceDetail";
		}

		ExperienceDetailsEntity experienceDetail = new ExperienceDetailsEntity();
		experienceDetail.setcompanyName(theExperienceProject.getCompanyName());
		experienceDetail.setDesignation(theExperienceProject.getDesignation());
		experienceDetail.setJoiningDate(theExperienceProject.getJoiningDate());
		experienceDetail.setLeavingDate(theExperienceProject.getLeavingDate());

		PersonalDetailsEntity personalDetails = this.personalDetailsServices
				.findById((Long) session.getAttribute("id"));

		experienceDetail.setPersonalDetailsEntity(personalDetails);

		this.experienceDetailService.save(experienceDetail);

		return "redirect:/projectDetails.html?id=" + experienceDetail.getExperienceId();
	}

}