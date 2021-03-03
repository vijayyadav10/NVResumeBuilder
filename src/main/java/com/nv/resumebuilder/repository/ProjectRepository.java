package com.nv.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nv.resumebuilder.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
