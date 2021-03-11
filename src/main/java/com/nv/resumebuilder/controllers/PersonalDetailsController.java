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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nv.resumebuilder.entity.PersonalDetailsEntity;
import com.nv.resumebuilder.service.PersonalDetailsServices;

@Controller
public class PersonalDetailsController {
	@Autowired
	private PersonalDetailsServices personalDetailsServices;// calling services to store data

	@RequestMapping("/personalDetails")
	public String personalDetailsForm() {

		return "personalDetails";
	}

	public PersonalDetailsController(PersonalDetailsServices personalDetailsServices) {
		super();
		this.personalDetailsServices = personalDetailsServices;
	}

	@RequestMapping(path = "/PersonalDetailsProcessing", method = RequestMethod.POST) // processing the personal details
																						// Form
	public String personalDetailsProcessing(@ModelAttribute PersonalDetailsEntity personalDetails, Model model, HttpSession session) {
		personalDetailsServices.savePersonalDetails(personalDetails);
		model.addAttribute("personaldetails1", personalDetails);
		System.out.println(personalDetails);
		
		session.setAttribute("id", personalDetails.getId());
		
		return "redirect:/education";
	}
}
