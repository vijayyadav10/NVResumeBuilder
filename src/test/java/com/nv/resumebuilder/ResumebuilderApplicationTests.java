package com.nv.resumebuilder;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.nv.resumebuilder.repository.PersonalDetailsRepository;
import com.nv.resumebuilder.service.PersonalDetailsServices;

@RunWith(SpringRunner.class)
@SpringBootTest
class ResumebuilderApplicationTests 
{
	@Autowired
	private PersonalDetailsServices service;
	@MockBean
	private PersonalDetailsRepository repository;
	@Test
	public void savePersonalDetails()
	{
		
	}

}
