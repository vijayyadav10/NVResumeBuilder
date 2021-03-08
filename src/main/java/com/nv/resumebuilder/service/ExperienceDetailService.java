package com.nv.resumebuilder.service;

import java.util.List;

import com.nv.resumebuilder.entity.ExperienceDetail;

public interface ExperienceDetailService {
	public List<ExperienceDetail> findAll();
	public ExperienceDetail findById(int theId);
	public ExperienceDetail save(ExperienceDetail theExperienceDetail);
	public void deleteById(int theId);
}
