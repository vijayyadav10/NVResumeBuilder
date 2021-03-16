package com.nv.resumebuilder.serviceimpl;

import java.util.Optional;

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

	@Override
	public EducationalDetailsEntity findByOtherId(Long id) 
	{
		Optional <EducationalDetailsEntity> educationalDetailsEntityOptional=educationalDetailsRepository.findByperson_id(id);
		EducationalDetailsEntity educationalDetailsEntity=educationalDetailsEntityOptional.get();
		return educationalDetailsEntity;
	}

}
