package com.nv.resumebuilder;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.nv.resumebuilder.entity.PersonalDetailsEntity;
import com.nv.resumebuilder.repository.PersonalDetailsRepository;
import com.nv.resumebuilder.serviceimpl.PersonalDetailServiceImpl;

@ExtendWith(SpringExtension.class)
public class PersonalDetailsTest 
{
	@InjectMocks
	private PersonalDetailServiceImpl service;

	private static final int USER_ONE_ID = 1;
	
	@Mock
	private PersonalDetailsRepository repository;

	private PersonalDetailsEntity personalEntity;

	@Before
	public void init() 
	{
		personalEntity = new PersonalDetailsEntity();
		personalEntity.setId(USER_ONE_ID);
		personalEntity.setBirthDate("16/03/2020");
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
	void testSavePersonalDetails()
	{
		 // Verification
	  
		Mockito.when(repository.save(personalEntity)).thenReturn(personalEntity);
		assertEquals(personalEntity,service.savePersonalDetails(personalEntity)); 
		Mockito.verify(repository, Mockito.times(1)).save(personalEntity);
	}
}