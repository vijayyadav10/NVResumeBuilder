package com.nv.resumebuilder.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.nv.resumebuilder.entity.PersonalDetailsEntity;
import com.nv.resumebuilder.entity.ReferenceDetailsEntity;
import com.nv.resumebuilder.model.ReferenceDetailsDto;
import com.nv.resumebuilder.service.PersonalDetailsServices;
import com.nv.resumebuilder.service.RefernceDetailsService;

@Controller
public class RefernceDetailsController {

	private static final ModelMapper modelMapper = new ModelMapper();
	private RefernceDetailsService service;
	private PersonalDetailsServices personalDetailsServices;

	@Autowired
	public RefernceDetailsController(RefernceDetailsService service, PersonalDetailsServices personalDetailsService) {
		this.service = service;
		this.personalDetailsServices = personalDetailsService;

	}

	// Reference Details form handler
	@GetMapping("/refernceDetails")
	public String refernceDetailsWelcomePage(Model model)

	{
		model.addAttribute("refernceDetails", new ReferenceDetailsDto());
		return "RefernceDetailsPage";
	}

	// Reference Details form Processing handler
	@PostMapping(value = "/handleReferncedetails")
	public String refernceDetailsProcess(@Valid @ModelAttribute("refernceDetails") ReferenceDetailsDto refernceDetails,
			BindingResult result, Model map, HttpSession session) {
		if (result.hasErrors()) {
			return "RefernceDetailsPage";
		}
		PersonalDetailsEntity personalDetails = this.personalDetailsServices
				.findById((Long) session.getAttribute("id"));
		ReferenceDetailsEntity referenceDetailsEntity = modelMapper.map(refernceDetails, ReferenceDetailsEntity.class);
		referenceDetailsEntity.setPersonalDetailsEntity(personalDetails);
		service.saveRefernceDetails(referenceDetailsEntity);
		session.setAttribute("message", "  You have Succesfully added Refernce Details Info...");
		return "redirect:/showRefernceDetails";
	}

	// show all Reference Details Information handler
	@RequestMapping("/showRefernceDetails")
	public String showRefernceDetails(Model m, HttpSession session) {

		PersonalDetailsEntity personalDetails = this.personalDetailsServices
				.findById((Long) session.getAttribute("id"));

		List<ReferenceDetailsEntity> refernceDetailsdata = service.getAllRefernceDetails(personalDetails.getId());

		System.out.println("***********" + refernceDetailsdata);
		m.addAttribute("referncedetailsList", refernceDetailsdata);

		return "RefernceDetailsShow";
	}

	// delete reference Details handler
	@RequestMapping("/delete/{id}")
	public RedirectView deleteRefernceDetails(@PathVariable("id") Long id, HttpServletRequest request, Model model,
			HttpSession session) {
		this.service.deleteRefernceDetails(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/showRefernceDetails");
		session.setAttribute("message", " You have Succesfully deleted Refernce Details Info...");
		return redirectView;
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView updateRefernceDetails(@PathVariable("id") Long id, Model model, HttpSession session) {

		ModelAndView mav = new ModelAndView("RefernceDetailsEdit");
		ReferenceDetailsEntity refernceDetails = service.getRefernceDetailsById(id);
		mav.addObject("refernceDetails", refernceDetails);
		session.setAttribute("message", " You have Succesfully updated Refernce Details Info...");
		return mav;
	}
}
