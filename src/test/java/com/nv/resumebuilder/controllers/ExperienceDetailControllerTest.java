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
@ContextConfiguration(classes = { WebTestConfig.class, ExperienceDetailController.class })
public class ExperienceDetailControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void experienceDetail() throws Exception {
		mockMvc.perform(get("/experienceDetailForm")).andExpect(status().is2xxSuccessful())
				.andExpect(view().name("experienceDetail"))
				.andExpect(forwardedUrl(WebConstants.VIEW_PREFIX + "experienceDetail" + WebConstants.VIEW_SUFFIX));
	}

	@Test
	public void saveExperienceDetailMissingParametersBadRequest() throws Exception {
		mockMvc.perform(post("/saveExperienceDetail")
//				.param("companyName", "Monster Hawk")
				.param("designation", "UIUX").param("projectName", "Monster Hawk UI")
				.param("projectDescription", "Design Monster Hawk UI With ReactJS").param("joiningDate", "2020-03-03")
				.param("leavingDate", "2021-03-03")).andExpect(status().is4xxClientError());
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