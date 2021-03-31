package com.nv.resumebuilder.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nv.resumebuilder.entity.EducationalDetailsEntity;

@Service
public interface EducationalDetailsService {

	public EducationalDetailsEntity educationalDetailsServices(EducationalDetailsEntity details);
	public Optional<EducationalDetailsEntity> findByPersonId(Long id);
	
}
