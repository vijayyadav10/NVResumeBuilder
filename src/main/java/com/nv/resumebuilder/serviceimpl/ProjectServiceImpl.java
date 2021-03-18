package com.nv.resumebuilder.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.resumebuilder.entity.ProjectDetailsEntity;
import com.nv.resumebuilder.repository.ProjectRepository;
import com.nv.resumebuilder.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	private ProjectRepository projectRepository;

	@Autowired
	public ProjectServiceImpl(ProjectRepository theProjectRepository) {
		this.projectRepository = theProjectRepository;
	}

	@Override
	public void save(ProjectDetailsEntity theProject) {
		this.projectRepository.save(theProject);
	}

	@Override
	public List<ProjectDetailsEntity> findById(Long theId) {

		return projectRepository.findAllById(theId);
	}

}
