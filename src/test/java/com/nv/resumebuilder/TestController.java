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

import com.nv.resumebuilder.controllers.PersonalDetailsController;
import com.nv.resumebuilder.entity.PersonalDetailsEntity;
import com.nv.resumebuilder.service.PersonalDetailsServices;

@ExtendWith(SpringExtension.class)
class TestController
{
   
	private MockMvc mockMvc;
	private PersonalDetailsEntity personalEntity;
	
	@InjectMocks
	private PersonalDetailsController personalDetailsController;
	
	@Mock
	private PersonalDetailsServices personalDetailsServices;
	
	@BeforeEach
	void setup() 
	{
	  this.mockMvc = MockMvcBuilders.standaloneSetup(new PersonalDetailsController(personalDetailsServices)).build();
	}
	  
	@Before
    public void init() 
	{
		personalEntity =new PersonalDetailsEntity();
		personalEntity.setBirthDate("16/03/1996");
		personalEntity.setCity("nagpur");
		personalEntity.setCountry("india");
		personalEntity.setCurrentAddress("khamla chowk");
		personalEntity.setEmailId("khushi.w16@gmail.com");
		personalEntity.setGender("female");
		personalEntity.setLanguageKnown("english,hindi,marathi");
		personalEntity.setLinkedinId("khushi.w16@gmail.com");
		personalEntity.setMaritialStatus("single");
		personalEntity.setNationality("indian");
		personalEntity.setPhoneNo("7798553408");
		personalEntity.setSkypeId("khushi.w16@gmail.com");
		personalEntity.setUserFirstName("khushabu");
		personalEntity.setUserMiddleName("pramod");
		personalEntity.setUserLastName("warade");
		
    }
	
	@Test
	@DisplayName("Testing form")
	void test() throws Exception 
	{
		mockMvc.perform(get("/personalDetails"))
	     .andExpect(status().isOk())
	     .andExpect(view().name("personalDetails"))
	     .andDo(MockMvcResultHandlers.print());
	}
	
	
	@Test
	@DisplayName("Testing controller for saving model/entity")
	void testAchievementsFormProcessing() throws Exception 
	{
		mockMvc.perform(get("/PersonalDetailsProcessing"))
	     .andExpect(status().isOk())
	     .andExpect(view().name("PersonalDetailsProcessing"))
	     .andDo(MockMvcResultHandlers.print());
	}
}

