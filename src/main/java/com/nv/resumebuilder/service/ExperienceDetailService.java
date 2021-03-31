package com.nv.resumebuilder.service;

import java.util.Optional;

import com.nv.resumebuilder.entity.ExperienceDetailsEntity;

public interface ExperienceDetailService {

	public Optional<ExperienceDetailsEntity> findById(Long theId);
    public ExperienceDetailsEntity save(ExperienceDetailsEntity theExperienceDetail);
	public Optional<ExperienceDetailsEntity> findByOtherId(Long id) ;
	public void deleteById(Long theId);

}
