package com.nv.resumebuilder.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.nv.resumebuilder.entity.ReferenceDetailsEntity;
import com.nv.resumebuilder.service.RefernceDetailsService;
import com.nv.resumebuilder.serviceimpl.RefernceDetailsServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;


@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
class RefernceDetailsControllerTest {

	private MockMvc mockMvc;
	@InjectMocks
	private RefernceDetailsController refernceDetailsController;
	@Mock
	private RefernceDetailsService service;
	
	@Test
	void testShowRefernceDetails() throws Exception {
		ReferenceDetailsEntity refernceEntity=new ReferenceDetailsEntity();
		refernceEntity.setId(1);
		refernceEntity.setPersonName("Rutuja bagade");
		refernceEntity.setDesignation("Software developer");
		refernceEntity.setEmailId("rutuja.bagade@newvisionsoftware.in");
		refernceEntity.setContactNo("9139251151");
		refernceEntity.setAddress("20,Ramcha got,Satara");
		refernceEntity.setOrganization("New vision softcom and consultancy,Pune");
         
		
	
		List<ReferenceDetailsEntity> ticketList = new ArrayList<ReferenceDetailsEntity>();
		ticketList.add(refernceEntity);
		
		Mockito.when(service.getAllRefernceDetails()).thenReturn(ticketList);
		//mockMvc.perform(get("/showRefernceDetails")).andExpect(status().isOk());
		
	}

}
