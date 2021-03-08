package com.nv.resumebuilder.serviceimpl;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.nv.resumebuilder.entity.EducationalDetailsEntity;
import com.nv.resumebuilder.repository.EducationalDetailsRepository;


@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class EducationalDetailsServiceImplTest
{
	
	@MockBean
	private EducationalDetailsRepository eduRepository;
	
	@MockBean
	private EducationalDetailsEntity details;
	
	@InjectMocks
	private EducationalDetailsServiceImpl service;

	
	@Test
	public void testEducationalDetailsServices() {
		 String nameOfCollege ="bansal";
		 String degree="B.E";
		 String university="RGPV";
		 String yearOfPassing="2010";
		 String percentage="80.88";
		 String degreeM="M tech";
		 String collegeNameM="Bansal";
		 String universityM="RGPV";
		 String yearOfPassingM="2020";
		 String technicalSkills="java";
		 
		 details = new EducationalDetailsEntity(nameOfCollege,degree, university,
					 yearOfPassing, percentage ,degreeM, collegeNameM,  universityM, yearOfPassingM,
					 technicalSkills);
		 
		    Mockito.when(eduRepository.save(details)).thenReturn(details);
			System.out.println(details);
			assertEquals(details, service.educationalDetailsServices(details));
			
		 
	}
}










