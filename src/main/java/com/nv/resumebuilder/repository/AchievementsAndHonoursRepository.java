package com.nv.resumebuilder.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.nv.resumebuilder.entity.AchievementsAndHonoursEntity;

@Repository
public interface AchievementsAndHonoursRepository extends CrudRepository<AchievementsAndHonoursEntity,Long>
{
}
