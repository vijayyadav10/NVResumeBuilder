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
	    AchievementsAndHonoursEntity achievemnetsAndHonoursEntity=new AchievementsAndHonoursEntity("particationevent1","particationevent2",
				"particationevent3","particationevent4","particationevent5","certification1","certification2",
				"certification3","certification4","certification5","awardsandhonoursdetails1",
				"awardsandhonoursdetails2","awardsandhonoursdetails3","awardsandhonoursdetails4",
				"awardsandhonoursdetails5");
		
		Assert.assertNotNull(achievementsAndHonoursRepository.save(achievemnetsAndHonoursEntity));

	}
}