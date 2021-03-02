package com.nv.resumebuilder.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;


import java.util.Arrays;
import java.util.List;


import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.nv.resumebuilder.entity.ReferenceDetailsEntity;
import com.nv.resumebuilder.repository.RefernceDetailsRepository;

@ExtendWith(SpringExtension.class)
class RefernceDetailsServiceImplTest {
	private static final int USER_ONE_ID = 1;
	private  ReferenceDetailsEntity refernceEntity;
	@InjectMocks
	private RefernceDetailsServiceImpl service;
	
	
	@Mock
	private RefernceDetailsRepository repository;
	
	 @Before
	  public void init() {
		refernceEntity =new ReferenceDetailsEntity();
			refernceEntity.setId(USER_ONE_ID);
			refernceEntity.setPersonName("Rutuja bagade");
			refernceEntity.setDesignation("Software developer");
			refernceEntity.setEmailId("rutuja.bagade@newvisionsoftware.in");
			refernceEntity.setContactNo("9139251151");
			refernceEntity.setAddress("20,Ramcha got,Satara");
			refernceEntity.setOrganization("New vision softcom and consultancy,Pune");
	  }
	 
	@Test
	@DisplayName("Saving Refernce Details Information")
	void testSaveRefernceDetails() {
		 // Verification
	  
		Mockito.when(repository.save(refernceEntity)).thenReturn(refernceEntity);
		assertEquals(refernceEntity ,service.saveRefernceDetails(refernceEntity)); 
		Mockito.verify(repository, Mockito.times(1)).save(refernceEntity);
	}
	
	
	@Test
	@DisplayName("Show all Refernce Details Information")
	void testGetAllRefernceDetails() {
		//given
		  List<ReferenceDetailsEntity> refernceEntityList = Arrays.asList(refernceEntity, refernceEntity, refernceEntity);
		   //when
		  Mockito.when(repository.findAll()).
		  //then
			  thenReturn(refernceEntityList);
			    assertEquals(refernceEntityList, service.getAllRefernceDetails());
		 // Verification
		    Assert.assertThat(refernceEntityList, Matchers.hasSize(3));
		    Mockito.verify(repository, Mockito.times(1)).findAll();
		    Mockito.verifyNoMoreInteractions(repository);
		
	}


}
