package com.nv.resumebuilder.controllers;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.nv.resumebuilder.config.WebTestConfig;

@RunWith(SpringRunner.class)
@ActiveProfiles({ "web" })
@WebMvcTest
@ContextConfiguration(classes = { WebTestConfig.class, PersonalDetailsController.class })
public class PersonalDetailsTestController 
{

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void personalDetail() throws Exception 
	{
		mockMvc.perform(get("/personalDetails"))
				.andExpect(status().is2xxSuccessful())
				.andExpect(view().name("personalDetail"))
				.andExpect(forwardedUrl(WebConstants.VIEW_PREFIX + "personalDetail"
						+ WebConstants.VIEW_SUFFIX));
	}

	@Test
	public void saveExperienceDetailMissingParametersBadRequest() throws Exception
	{
		mockMvc.perform(post("/PersonalDetailsProcessing")
				.param("userFirstName", "khushabu")
				.param("userMiddleName", "pramod")
				.param("userLastName", "warade")
				.param("birthDate", "16/03/1996")
				.param("nationality", "indian")
				.param("gender", "female")
				.param("maritialStatus","single")
				.param("emailId","khushi.w16@gmail.com")
				.param("linkedinId","khushi.w16@gmail.com")
				.param("skypeId","khushi.w16@gmail.com")
				.param("phoneNo","7798553408")
				.param("currentAddress","khamla chowk")
				.param("country","india")
				.param("city","nagpur")
				.param("languageKnown","english,hindi,marathi"))
				.andExpect(view().name("PersonalDetailsProcessing"))
				.andExpect(forwardedUrl(WebConstants.VIEW_PREFIX + "personalDetails" + WebConstants.VIEW_SUFFIX));
	}
}

/*
 * MockMvc has been around since Spring 3.2. This providing a powerful way to
 * mock Spring MVC for testing MVC web applications. Through MockMvc, you can
 * send mock HTTP requests to a controller and test how the controller behaves
 * without running the controller within a server.
 */

/*
 * ActiveProfiles => @ActiveProfiles is a class-level annotation that is used to
 * specify which profile should be selected when loading an ApplicationContext
 * for test classes. ref =>
 * https://www.concretepage.com/spring-5/activeprofiles-example-spring-test
 */