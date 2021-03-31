/**
 * @Controller:-the annotated class is a controller.
 *  It is a specialization of @Component and is autodetected through classpath scanning. 
 *  It is typically used in combination with annotated handler 
 *  methods based on the @RequestMapping annotation.
 *  
 *  @Autowired:- used in constructor, setter method, properties
 *  @ModelAttribute:- Parameter level,Method Level,
 *  the property of the Model object and is used to prepare the model data. 
 *  This annotation binds a method variable or the model object to a named model attribute. 
 *  @ModelAttribute annotation as a method parameter,
 *   it binds the form data with a POJO bean. 
 *   It has a value attribute which acts as a name of the model attribute to bind.
 *   @ModelAttribute annotation at the method level, developers can add the values 
 *   in the Model at a global level. It means for every request, a default value
 *    will be there in the controller for every response. 
 *    @Autowired: Spring provides annotation-based auto-wiring by providing 
 *    @Autowired annotation. It is used to autowire spring bean on setter methods,
 *    instance variable, and constructor. 
 *    When we use @Autowired annotation, the spring container
 *     auto-wires the bean by matching data-type.
 *  
 */

package com.nv.resumebuilder.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nv.resumebuilder.entity.PersonalDetailsEntity;
import com.nv.resumebuilder.service.PersonalDetailsServices;

@Controller
public class PersonalDetailsController {
	@Autowired
	private PersonalDetailsServices personalDetailsServices;// calling services to store data

	public PersonalDetailsController(PersonalDetailsServices personalDetailsServices) {

		this.personalDetailsServices = personalDetailsServices;
	}

	@RequestMapping("/personalDetails")
	public String personalDetailsForm(Model model) {
		model.addAttribute("personalDetailsInfo", new PersonalDetailsEntity());
		return "personalDetail";
	}

	// Reference Details form Processing handler
	@PostMapping(value = "/handlePersonaldetails")
	public String personalDetailsProcess(
			@Valid @ModelAttribute("personalDetailsInfo") PersonalDetailsEntity personalDetailsEntity,
			BindingResult result, Model map, HttpSession session) {
		if (result.hasErrors()) {
			return "personalDetail";
		}
		map.addAttribute("personalDetailsInfo", personalDetailsEntity);
		System.out.println(personalDetailsEntity);
		
		personalDetailsServices.savePersonalDetails(personalDetailsEntity);
		session.setAttribute("id", personalDetailsEntity.getId());
		
		session.setAttribute("message" , "You have Succesfully added Personal details Info...");
		return "redirect:/education";
	}

}
