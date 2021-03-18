package com.nv.resumebuilder.service;

import com.nv.resumebuilder.entity.ExperienceDetailsEntity;

public interface ExperienceDetailService {

	public ExperienceDetailsEntity findById(Long theId);
    public ExperienceDetailsEntity save(ExperienceDetailsEntity theExperienceDetail);
	public ExperienceDetailsEntity findByOtherId(Long id) ;
	public void deleteById(Long theId);

}
