package com.nv.resumebuilder.service;

import org.springframework.stereotype.Service;

import com.nv.resumebuilder.entity.EducationalDetailsEntity;

@Service
public interface EducationalDetailsService {

	public EducationalDetailsEntity educationalDetailsServices(EducationalDetailsEntity details);
	EducationalDetailsEntity findByPersonId(long id);
}
