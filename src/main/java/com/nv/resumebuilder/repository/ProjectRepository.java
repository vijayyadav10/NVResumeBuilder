package com.nv.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.nv.resumebuilder.entity.ProjectDetailsEntity;

public interface ProjectRepository extends JpaRepository<ProjectDetailsEntity, Long>{
	//public ProjectDetailsEntity findByperson_id( @Param("id") Long id);
}
