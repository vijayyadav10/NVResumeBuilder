package com.nv.resumebuilder.service;

import com.nv.resumebuilder.entity.AchievementsAndHonoursEntity;

public interface AchievementsAndHonoursServices {
	public AchievementsAndHonoursEntity addAchievementsAndHonours(AchievementsAndHonoursEntity achievemnetsandhonours);
	AchievementsAndHonoursEntity findBYPersonId(Long id);
}
