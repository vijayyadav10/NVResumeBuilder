package com.nv.resumebuilder.serviceimpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.nv.resumebuilder.entity.OrganizationalDetailsEntity;
import com.nv.resumebuilder.repository.OrganizationalDetailsRepository;

@ExtendWith(SpringExtension.class)
public class OrganizationalDetailsServiceImplTest {
	private OrganizationalDetailsEntity organizationdetailsEntity;

	@InjectMocks
	private OrganizationalDetailsServiceImpl service;

	@Mock
	private OrganizationalDetailsRepository orgRepository;

	private String comName = null;
	String designation = null;
	String date;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		comName = "NV";
		designation = "tester";
		date = "05/03/2021";
	}

	@Test
	public void testOrganizationDetailsServices() {
		organizationdetailsEntity = new OrganizationalDetailsEntity(comName, designation, date);
		Mockito.when(orgRepository.save(organizationdetailsEntity)).thenReturn(organizationdetailsEntity);
		System.out.println(organizationdetailsEntity);
		assertEquals(organizationdetailsEntity, service.addorganizationDetailsServices(organizationdetailsEntity));
		Mockito.verify(orgRepository, Mockito.times(1)).save(organizationdetailsEntity);
	}

	@Test
	public void testOrganizationDetailsServicesNotNull() {
		organizationdetailsEntity = new OrganizationalDetailsEntity(comName, designation, date);
		Mockito.when(orgRepository.save(organizationdetailsEntity)).thenReturn(organizationdetailsEntity);
		System.out.println(organizationdetailsEntity);
		assertNotNull(organizationdetailsEntity);
	}

	@AfterEach
	public void cleanUp() {
		comName = null;
		designation = null;
		date = null;
	}
}
