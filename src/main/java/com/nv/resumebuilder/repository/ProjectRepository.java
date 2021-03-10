package com.nv.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nv.resumebuilder.entity.ProjectDetailsEntity;

public interface ProjectRepository extends JpaRepository<ProjectDetailsEntity, Long>{

}
