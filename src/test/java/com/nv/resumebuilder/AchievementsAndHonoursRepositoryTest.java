package com.nv.resumebuilder;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nv.resumebuilder.entity.AchievementsAndHonoursEntity;
import com.nv.resumebuilder.repository.AchievementsAndHonoursRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class AchievementsAndHonoursRepositoryTest 
{
	@Autowired
	private AchievementsAndHonoursRepository achievementsAndHonoursRepository;
	
	
	@Test
	public void addAchievementsAndHonoursTest() 
	{
	    AchievementsAndHonoursEntity achievemnetsAndHonoursEntity=new AchievementsAndHonoursEntity("particationevent1"
	    		
				,"certification1","awardsandhonoursdetails1"
				
				);
		
		Assert.assertNotNull(achievementsAndHonoursRepository.save(achievemnetsAndHonoursEntity));

	}
}