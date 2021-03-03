package com.nv.resumebuilder.serviceimpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.nv.resumebuilder.entity.OrganizationalDetailsEntity;
import com.nv.resumebuilder.repository.OrganizationalDetailsRepository;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class OrganizationalDetailsServiceImplTest {
	@MockBean
	private OrganizationalDetailsRepository orgRepository;

	@MockBean
	private OrganizationalDetailsEntity organizationdetailsEntity;

	@InjectMocks
	private OrganizationalDetailsServiceImpl service;

	@Test
	public void testOrganizationDetailsServices() {
		String comName = "NV";
		String designation = "tester";
		@SuppressWarnings("deprecation")
		Date date = new Date(2021, 22, 11);
		organizationdetailsEntity = new OrganizationalDetailsEntity(comName, designation, date);
		Mockito.when(orgRepository.save(organizationdetailsEntity)).thenReturn(organizationdetailsEntity);
		System.out.println(organizationdetailsEntity);
		assertEquals(organizationdetailsEntity, service.addorganizationDetailsServices(organizationdetailsEntity));
		Mockito.verify(orgRepository, Mockito.times(1)).save(organizationdetailsEntity);
		
		//when(achievementsAndHonoursRepository.save(achievemnetsAndHonoursEntity)).thenReturn(achievemnetsAndHonoursEntity);           
	//	assertEquals(achievemnetsAndHonoursEntity,achievementsAndHonoursServices.
			//	addAchievementsAndHonours(achievemnetsAndHonoursEntity));
	}
}
