package com.nv.resumebuilder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nv.resumebuilder.entity.ProjectDetailsEntity;

public interface ProjectRepository extends JpaRepository<ProjectDetailsEntity, Long>{

	@Query("from ProjectDetailsEntity where projectId=:projectId")
	List<ProjectDetailsEntity> findByExperienceId(@Param("projectId") Long projectId);
	
}
