package com.nv.resumebuilder.controllers;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
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


import com.nv.resumebuilder.dto.ReferenceDetailsDto;
import com.nv.resumebuilder.entity.ReferenceDetailsEntity;
import com.nv.resumebuilder.service.RefernceDetailsService;



@Controller
public class RefernceDetailsController {

	private static final ModelMapper modelMapper = new ModelMapper();
	private RefernceDetailsService service;
	
	
	
	@Autowired
	public RefernceDetailsController(RefernceDetailsService service) {
		this.service = service;
		
	}
	@GetMapping("/refernceDetails")
	public String refernceDetailsWelcomePage(Model model)

	{
		model.addAttribute("refernceDetails",new ReferenceDetailsDto() );
		return "RefernceDetailsPage";
	}

	@PostMapping(value = "/handleReferncedetails")
	public String refernceDetailsProcess(@Valid @ModelAttribute("refernceDetails") ReferenceDetailsDto refernceDetails,
			BindingResult result, Model map) {
		if (result.hasErrors()) {
			return "RefernceDetailsPage";
		}
		
		service.saveRefernceDetails(modelMapper.map(refernceDetails,ReferenceDetailsEntity.class));
		map.addAttribute("message", "Addded Succesfully !!!!");
		return "redirect:/showRefernceDetails";	
	}

	@RequestMapping("/showRefernceDetails")
	public String showRefernceDetails(Model m) {

		List<ReferenceDetailsEntity> refernceDetailsdata = service.getAllRefernceDetails();
		System.out.println(refernceDetailsdata);
		
		m.addAttribute("referncedetailsList", refernceDetailsdata);

		return "RefernceDetailsShow";
	}
	// delete handler
		@RequestMapping("/delete/{id}")
		public RedirectView deleteRefernceDetails(@PathVariable("id") Integer id, HttpServletRequest request) {
			this.service.deleteRefernceDetails(id);
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl(request.getContextPath() + "/showRefernceDetails");
			return redirectView;
		}
		@RequestMapping("/edit/{id}")
		public ModelAndView updateRefernceDetails(@PathVariable("id") Integer id,Model model)
		{
	
			ModelAndView mav = new ModelAndView("RefernceDetailsEdit");
			ReferenceDetailsEntity refernceDetails = service.getRefernceDetailsById(id);
		    mav.addObject("refernceDetails", refernceDetails);
		     return mav;
		}
}
