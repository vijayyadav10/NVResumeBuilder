package com.nv.resumebuilder.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.nv.resumebuilder.entity.OrganizationalDetailsEntity;
import com.nv.resumebuilder.service.OrganizationalDetailsService;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class OrganizationalDetailscontrollerTest {

	private MockMvc mockMvc;
	OrganizationalDetailsEntity organizationalDetailsEntity;

	@Mock
	OrganizationalDetailsService organizationDetailServiceobj;

	void setUp() {
		this.mockMvc = MockMvcBuilders
				.standaloneSetup(new OrganizationalDetailsController(organizationDetailServiceobj)).build();

	}

	private String comName = null;
	String designation = null;
	String date;

	@BeforeEach
	public void init() {

		comName = "NV";
		designation = "tester";
		date = "18/01/2021";

		organizationalDetailsEntity = new OrganizationalDetailsEntity(comName, designation, date);

	}

	@Test
	void testOrgForm() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/organizationdetailsform"))// creates the http req
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.view().name("organizationaldetailsform"));
		// .andDo(MockMvcResultHandlers.print());
	}

	/*
	 * @Test public void giventUrl_whenGetRequest_thenFindGetResponse() throws
	 * Exception { MockHttpServletRequestBuilder builder = MockMvcRequestBuilders
	 * .get("/organizationaldetailsform");
	 * 
	 * ResultMatcher contentMatcher = MockMvcResultMatchers.content()
	 * .string("organizationaldetailsform");
	 * 
	 * this.mockMvc.perform(builder).andExpect(contentMatcher)
	 * .andExpect(MockMvcResultMatchers.status().isOk()); }
	 */
	/*
	 * @Autowired private MockMvc mockMvc;
	 * 
	 * 
	 * 
	 * 
	 * @Test public void testOrgForm() throws Exception {
	 * System.out.println(mockMvc);
	 * mockMvc.perform(MockMvcRequestBuilders.get("/organizationaldetailsform"))
	 * .andExpect(MockMvcResultMatchers.status().isOk())
	 * .andExpect(MockMvcResultMatchers.content().string("organizationaldetailsform"
	 * )); }
	 */
}
