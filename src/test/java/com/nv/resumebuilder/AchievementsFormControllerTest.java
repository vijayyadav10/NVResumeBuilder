package com.nv.resumebuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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


@ExtendWith(SpringExtension.class)
class AchievementsFormControllerTest 
{
   
	private MockMvc mockMvc;
	private AchievementsAndHonoursEntity achievementsAndHonoursEntity;
	
	@InjectMocks
	private AchievementsFormController achievementsFormController;
	
	@Mock
	private AchievementsAndHonoursServices achievementsAndHonoursServices;
	
	@BeforeEach
	void setup() 
	{
	  this.mockMvc = MockMvcBuilders.standaloneSetup(new AchievementsFormController(achievementsAndHonoursServices)).build();
	}
	  
	@Before
    public void init() 
	{
		achievementsAndHonoursEntity =new AchievementsAndHonoursEntity();
		
		achievementsAndHonoursEntity.setParticationevent1("Particationevent 1");
		achievementsAndHonoursEntity.setParticationevent2("Particationevent 2");
		achievementsAndHonoursEntity.setParticationevent3("Particationevent 3");
		achievementsAndHonoursEntity.setParticationevent4("Particationevent 4");
		achievementsAndHonoursEntity.setParticationevent5("Particationevent 5");
		
		achievementsAndHonoursEntity.setCertification1("Certification 1");
		achievementsAndHonoursEntity.setCertification2("Certification 2");
		achievementsAndHonoursEntity.setCertification3("Certification 3");
		achievementsAndHonoursEntity.setCertification4("Certification 4");
		achievementsAndHonoursEntity.setCertification5("Certification 5");
		
		achievementsAndHonoursEntity.setAwardsandhonoursdetails1("Awards and honours details 1");
		achievementsAndHonoursEntity.setAwardsandhonoursdetails2("Awards and honours details 2");
		achievementsAndHonoursEntity.setAwardsandhonoursdetails3("Awards and honours details 3");
		achievementsAndHonoursEntity.setAwardsandhonoursdetails4("Awards and honours details 4");
		achievementsAndHonoursEntity.setAwardsandhonoursdetails5("Awards and honours details 5");
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


}
