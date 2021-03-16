package com.nv.resumebuilder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nv.resumebuilder.entity.ExperienceDetailsEntity;

public interface ExperienceDetailRepository extends JpaRepository<ExperienceDetailsEntity, Long>{

	@Query(value = "select * from experiences e where e.id =?", nativeQuery = true)
	public Optional <ExperienceDetailsEntity> findByperson_id( @Param("id") Long id);
}