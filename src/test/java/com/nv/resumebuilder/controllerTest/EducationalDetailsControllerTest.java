package com.nv.resumebuilder.controllerTest;


import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class EducationalDetailsControllerTest {
	@Autowired
	private WebApplicationContext context;
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	@Test 
	public void giventUrl_whenGetRequest_thenFindGetResponse() 
	  throws Exception {
	MockHttpServletRequestBuilder builder = MockMvcRequestBuilders
		      .get("/education");
	
	ResultMatcher contentMatcher = MockMvcResultMatchers.content()
		      .string("educational");

		    this.mockMvc.perform(builder).andExpect(contentMatcher)
		      .andExpect(MockMvcResultMatchers.status().isOk());
}
}
	
