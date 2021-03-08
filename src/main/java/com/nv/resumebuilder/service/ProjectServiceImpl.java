package com.nv.resumebuilder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.resumebuilder.entity.Project;
import com.nv.resumebuilder.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService{

	private ProjectRepository projectRepository;
	
	@Autowired
	public ProjectServiceImpl(ProjectRepository theProjectRepository) {
		this.projectRepository = theProjectRepository;
	}
	
	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Project theProject) {
		this.projectRepository.save(theProject);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}

}
