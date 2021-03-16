package com.nv.resumebuilder.service;

import java.util.List;

import com.nv.resumebuilder.entity.ExperienceDetailsEntity;

public interface ExperienceDetailService {
	public List<ExperienceDetailsEntity> findAll();

	public ExperienceDetailsEntity findById(Long theId);

	public ExperienceDetailsEntity save(ExperienceDetailsEntity theExperienceDetail);

	public void deleteById(Long theId);
	
	public ExperienceDetailsEntity findByOtherId(Long id);
}
