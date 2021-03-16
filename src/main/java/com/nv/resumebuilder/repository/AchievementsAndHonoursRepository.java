package com.nv.resumebuilder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nv.resumebuilder.entity.AchievementsAndHonoursEntity;

@Repository
public interface AchievementsAndHonoursRepository extends CrudRepository<AchievementsAndHonoursEntity, Long> 
{
	@Query(value = "select * FROM ACHIEVEMENTS_AND_HONOURS_ENTITY a where a.person_id=?",nativeQuery = true)
	public Optional<AchievementsAndHonoursEntity> findBypersonid( @Param("id") Long id);
}
