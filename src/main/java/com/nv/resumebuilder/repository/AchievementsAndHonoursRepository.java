package com.nv.resumebuilder.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nv.resumebuilder.entity.AchievementsAndHonoursEntity;

@Repository
public interface AchievementsAndHonoursRepository extends CrudRepository<AchievementsAndHonoursEntity, Long> 
{
	@Query(value = "SELECT * FROM achievements_and_honoursdetails where Person_id=?", nativeQuery = true)
	AchievementsAndHonoursEntity findByPersonId( @Param("id") Long id);
}
