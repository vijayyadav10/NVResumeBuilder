package com.nv.resumebuilder.service;

import java.util.Optional;

import com.nv.resumebuilder.entity.AchievementsAndHonoursEntity;

public interface AchievementsAndHonoursServices {
	public AchievementsAndHonoursEntity addAchievementsAndHonours(AchievementsAndHonoursEntity achievemnetsandhonours);
	Optional<AchievementsAndHonoursEntity> findBYPersonId(Long id);
}
