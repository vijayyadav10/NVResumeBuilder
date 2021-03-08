package com.nv.resumebuilder.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.resumebuilder.entity.EducationalDetailsEntity;
import com.nv.resumebuilder.repository.EducationalDetailsRepository;
import com.nv.resumebuilder.service.EducationalDetailsService;

@Service
public class EducationalDetailsServiceImpl implements EducationalDetailsService {

	@Autowired
	public EducationalDetailsRepository educationalDetailsRepository;

	@Override
	public EducationalDetailsEntity educationalDetailsServices(EducationalDetailsEntity details) {
		educationalDetailsRepository.save(details);
		return details;

	}

}
