package com.nv.resumebuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.nv.resumebuilder.controllers.AchievementsFormController;
import com.nv.resumebuilder.entity.AchievementsAndHonoursEntity;
import com.nv.resumebuilder.service.AchievementsAndHonoursServices;
import com.nv.resumebuilder.service.PersonalDetailsServices;


@ExtendWith(SpringExtension.class)
class AchievementsFormControllerTest 
{

	private MockMvc mockMvc;
	private AchievementsAndHonoursEntity achievementsAndHonoursEntity;

	@InjectMocks
	private AchievementsFormController achievementsFormController;

	@Mock
	private AchievementsAndHonoursServices achievementsAndHonoursServices;
	@Mock
	private PersonalDetailsServices personalDetailsServices;

	@BeforeEach
	void setup() 
	{
		this.mockMvc = MockMvcBuilders.standaloneSetup(new AchievementsFormController(achievementsAndHonoursServices,personalDetailsServices)).build();
	}

	@Before(value = "")
	public void init() 
	{
		achievementsAndHonoursEntity =new AchievementsAndHonoursEntity();

		achievementsAndHonoursEntity.setParticationevent1("Particationevent 1");
		

		achievementsAndHonoursEntity.setCertification1("Certification 1");
		

		achievementsAndHonoursEntity.setAwardsandhonoursdetails1("Awards and honours details 1");
	
	}

	@Test
	@DisplayName("Testing redirection to Achievements form")
	void testAchievementsForm() throws Exception 
	{
		mockMvc.perform(get("/AchievementsForm"))
		.andExpect(status().isOk())
		.andExpect(view().name("AchievementsForm"))
		.andDo(MockMvcResultHandlers.print());
	}


	@Test
	@DisplayName("Testing controller for saving model/entity")
	void testAchievementsFormProcessing() throws Exception 
	{
		mockMvc.perform(get("/AchievementsFormProcessing"))
		.andExpect(status().isOk())
		.andExpect(view().name("AchievementsFormProcessing"))
		.andDo(MockMvcResultHandlers.print());
	}


	@Nested // it runs when execution of all other tests is done , here we are using this to provide our tests some different initialization 
	class TestNest
	{
		@BeforeEach
		public void init1() 
		{
			achievementsAndHonoursEntity =new AchievementsAndHonoursEntity();

			achievementsAndHonoursEntity.setParticationevent1("");

			achievementsAndHonoursEntity.setCertification1("");

			achievementsAndHonoursEntity.setAwardsandhonoursdetails1("Awards and honours details 1");
		}

		@Test
		@DisplayName("Testing controller for saving model/entity in case valid data is not provided")
		void testAchievementsFormProcessingWhenInvalidDataIsProvided() throws Exception 
		{
			mockMvc.perform(get("/AchievementsFormProcessing"))
			.andExpect(status().isNotFound())
			.andExpect(view().name("AchievementsFormProcessing"))
			.andDo(MockMvcResultHandlers.print());
		}
	}

}
