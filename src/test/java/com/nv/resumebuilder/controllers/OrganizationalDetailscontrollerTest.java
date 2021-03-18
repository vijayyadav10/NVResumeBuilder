package com.nv.resumebuilder.controllers;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.nv.resumebuilder.entity.OrganizationalDetailsEntity;
import com.nv.resumebuilder.service.OrganizationalDetailsService;

@ExtendWith(SpringExtension.class)
public class OrganizationalDetailscontrollerTest {

	@InjectMocks
	private OrganizationalDetailsController organizationalDetailsController;

	private MockMvc mockMvc;
	OrganizationalDetailsEntity organizationalDetailsEntity;

	@Mock
	OrganizationalDetailsService organizationDetailServiceobj;

	@BeforeEach
	void setup() {
		this.mockMvc = MockMvcBuilders
				.standaloneSetup(new OrganizationalDetailsController(organizationDetailServiceobj)).build();
	}

	@Before(value = "")
	public void init() {
		organizationalDetailsEntity = new OrganizationalDetailsEntity();
		
		organizationalDetailsEntity.setComName("NV");
		organizationalDetailsEntity.setDesignation("tester");
		organizationalDetailsEntity.setDate("18/01/2021");
		}

	@Test
	void testOrgForm() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/organizationaldetailsform"))// creates the http req
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.view().name("currentorganizationaldetailsform"))
				.andDo(MockMvcResultHandlers.print());
	}

	/*
	 * @Test void testOrganizationalDetailsFormProcessing() throws Exception {
	 * mockMvc.perform(MockMvcRequestBuilders.get("/viewOrganizationalDetails"))
	 * .andExpect(MockMvcResultMatchers.status().isOk())
	 * .andExpect(MockMvcResultMatchers.view().name("viewOrganizationalDetails"))
	 * .andDo(MockMvcResultHandlers.print()); }
	 */

}
