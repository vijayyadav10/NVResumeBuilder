package com.nv.resumebuilder.controllers;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.nv.resumebuilder.entity.ReferenceDetailsEntity;
import com.nv.resumebuilder.service.RefernceDetailsService;
@ExtendWith(SpringExtension.class)

class RefernceDetailsControllerTest {
	private MockMvc mockMvc;
	 private  ReferenceDetailsEntity refernceEntity;
	 
	 @InjectMocks
	 RefernceDetailsController refernceDetailsController;
	 
	 @Mock
		private RefernceDetailsService service;

   @BeforeEach
   void setup() {
       this.mockMvc = MockMvcBuilders.standaloneSetup(new RefernceDetailsController(service)).build();
   }
   @Before
	  public void init() {
		refernceEntity =new ReferenceDetailsEntity();
			refernceEntity.setId(1);
			refernceEntity.setPersonName("Rutuja bagade");
			refernceEntity.setDesignation("Software developer");
			refernceEntity.setEmailId("rutuja.bagade@newvisionsoftware.in");
			refernceEntity.setContactNo("9139251151");
			refernceEntity.setAddress("20,Ramcha got,Satara");
			refernceEntity.setOrganization("New vision softcom and consultancy,Pune");
	  }
	@Test
	@DisplayName("Testing Refernce Details Form Page handler")
	void testRefernceDetailsWelcomePage() throws Exception {
		mockMvc.perform(get("/refernceDetails"))
	     .andExpect(status().isOk())
	     .andExpect(view().name("RefernceDetailsPage"))
	     .andDo(MockMvcResultHandlers.print());
	     
	     
	}
	@DisplayName("Testing  Show all Refernce Details handler")
	@Test
	void testShowRefernceDetails() throws Exception {
     List<ReferenceDetailsEntity> refernceEntityList = Arrays.asList(refernceEntity, refernceEntity);
		
	    Mockito.when(service.getAllRefernceDetails()).thenReturn(refernceEntityList);
	  //Web test
			mockMvc.perform(get("/showRefernceDetails"))
		     .andExpect(status().isOk())
		     .andExpect(view().name("RefernceDetailsShow"))
		     .andExpect(MockMvcResultMatchers.model().attribute("referncedetailsList",refernceEntityList ));
			
	//verify at a time only one method is runnable
		     verify(service, times(1)).getAllRefernceDetails();
		        verifyNoMoreInteractions(service);
	}
	
	@DisplayName("Testing Update Refernce Details handler ")
	@Test
	void testUpdateRefernceDetails() throws Exception
	{
		 
			//when
			 Mockito.when(service.getRefernceDetailsById(1)).thenReturn(refernceEntity);
			 
			//web test
			mockMvc.perform(get("/edit/{id}",1))
		     .andExpect(status().isOk())
		     .andExpect(view().name("RefernceDetailsEdit"))
		     .andExpect(model().attribute("refernceDetails",refernceEntity ))
			.andDo(MockMvcResultHandlers.print());
			
			//verify at a time only one method is runnable
		     verify(service, times(1)).getRefernceDetailsById(1);
		        verifyNoMoreInteractions(service);
	      
	}

}
