package com.nv.resumebuilder.service;

import java.util.List;

import com.nv.resumebuilder.entity.ProjectDetailsEntity;

public interface ProjectService {

	public List<ProjectDetailsEntity> findAll();
	public ProjectDetailsEntity findById(Long theId);
	public void save(ProjectDetailsEntity theProject);
	public void deleteById(Long theId);
	
}
