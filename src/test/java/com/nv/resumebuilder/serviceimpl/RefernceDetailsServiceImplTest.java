package com.nv.resumebuilder.serviceimpl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.nv.resumebuilder.entity.PersonalDetailsEntity;
import com.nv.resumebuilder.entity.ReferenceDetailsEntity;
import com.nv.resumebuilder.repository.RefernceDetailsRepository;

@ExtendWith(SpringExtension.class)
class RefernceDetailsServiceImplTest {
	private static final Long USER_ONE_ID = 1L;

	private ReferenceDetailsEntity refernceEntity;
	private PersonalDetailsEntity  personalEntity;

	@InjectMocks
	private RefernceDetailsServiceImpl service;
	
	@Mock
	private RefernceDetailsRepository repository;

	@Before
	public void init() {
		refernceEntity = new ReferenceDetailsEntity();
		refernceEntity.setId(USER_ONE_ID);
		refernceEntity.setRefernceName("Rutuja bagade");
		refernceEntity.setDesignation("Software developer");
		refernceEntity.setEmailId("rutuja.bagade@newvisionsoftware.in");
		refernceEntity.setContactNo("9139251151");
		refernceEntity.setAddress("20,Ramcha got,Satara");
		refernceEntity.setOrganization("New vision softcom and consultancy,Pune");
			personalEntity = new PersonalDetailsEntity();
		personalEntity.setId(USER_ONE_ID);
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
		refernceEntity.setPersonalDetailsEntity(personalEntity);
	}

	@Test
	@DisplayName("Saving Refernce Details Information")
	void testSaveRefernceDetails() {

		// Verification

		Mockito.when(repository.save(refernceEntity)).thenReturn(refernceEntity);
		assertEquals(refernceEntity, service.saveRefernceDetails(refernceEntity));
		Mockito.verify(repository, Mockito.times(1)).save(refernceEntity);
	}


	

}
