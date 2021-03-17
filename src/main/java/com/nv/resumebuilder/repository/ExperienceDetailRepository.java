package com.nv.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nv.resumebuilder.entity.ExperienceDetailsEntity;

public interface ExperienceDetailRepository extends JpaRepository<ExperienceDetailsEntity, Long> {
	@Query(value = "select * from experiencedetails e where e.id =?", nativeQuery = true)
	public ExperienceDetailsEntity findByperson_id(@Param("id") Long id);
}