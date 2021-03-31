package com.nv.resumebuilder.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.resumebuilder.entity.AchievementsAndHonoursEntity;
import com.nv.resumebuilder.repository.AchievementsAndHonoursRepository;
import com.nv.resumebuilder.service.AchievementsAndHonoursServices;

@Service
public class AchievementsAndHonoursServicesImplementation implements AchievementsAndHonoursServices {
	@Autowired
	private AchievementsAndHonoursRepository achievementsAndHonoursRepository;

	@Override
	public AchievementsAndHonoursEntity addAchievementsAndHonours(AchievementsAndHonoursEntity achievemnetsandhonours) {
		achievementsAndHonoursRepository.save(achievemnetsandhonours); // saving our data in h2 database
		return achievemnetsandhonours;
	}

	@Override
	public Optional<AchievementsAndHonoursEntity> findBYPersonId(Long id) {
		Optional<AchievementsAndHonoursEntity> result = Optional
				.ofNullable(this.achievementsAndHonoursRepository.findByPersonId(id));

		/*
		 * AchievementsAndHonoursEntity achievementsAndHonoursEntity = null;
		 * 
		 * if (result.isPresent()) { achievementsAndHonoursEntity = result.get(); } else
		 * { throw new RuntimeException("Did not find employee id - " + id); }
		 */
		return result;
	}

}
