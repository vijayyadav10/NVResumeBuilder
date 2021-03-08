package com.nv.resumebuilder.service;

import java.util.List;

import com.nv.resumebuilder.entity.Project;

public interface ProjectService {

	public List<Project> findAll();
	public Project findById(int theId);
	public void save(Project theProject);
	public void deleteById(int theId);
	
}
