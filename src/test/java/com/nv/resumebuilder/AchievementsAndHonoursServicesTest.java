package com.nv.resumebuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.nv.resumebuilder.entity.AchievementsAndHonoursEntity;
import com.nv.resumebuilder.repository.AchievementsAndHonoursRepository;
import com.nv.resumebuilder.serviceimpl.AchievementsAndHonoursServicesImplementation;

@ExtendWith(SpringExtension.class)
class AchievementsAndHonoursServicesTest 
{
	@InjectMocks
	private AchievementsAndHonoursServicesImplementation achievementsAndHonoursServices;

	@Mock
	private AchievementsAndHonoursRepository achievementsAndHonoursRepository;

	@Mock
	private AchievementsAndHonoursEntity achievemnetsAndHonoursEntity;

	@Test
	public void addAchievementsAndHonoursTest() 
	{
achievemnetsAndHonoursEntity=new AchievementsAndHonoursEntity("particationevent1"
	    		
				,"certification1","awardsandhonoursdetails1"
				
				);
		
		when(achievementsAndHonoursRepository.save(achievemnetsAndHonoursEntity)).thenReturn(achievemnetsAndHonoursEntity);           
		assertEquals(achievemnetsAndHonoursEntity,achievementsAndHonoursServices.addAchievementsAndHonours(achievemnetsAndHonoursEntity));
	}
}
