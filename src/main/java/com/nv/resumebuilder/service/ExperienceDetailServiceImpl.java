package com.nv.resumebuilder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.resumebuilder.entity.ExperienceDetail;
import com.nv.resumebuilder.repository.ExperienceDetailRepository;

@Service
public class ExperienceDetailServiceImpl implements ExperienceDetailService{

	private ExperienceDetailRepository experienceDetailRepository;
	
	@Autowired
	public ExperienceDetailServiceImpl(ExperienceDetailRepository theExperienceDetailRepository) {
		this.experienceDetailRepository = theExperienceDetailRepository;
	}
	
	@Override
	public List<ExperienceDetail> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExperienceDetail findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExperienceDetail save(ExperienceDetail theExperienceDetail) {
		return this.experienceDetailRepository.save(theExperienceDetail);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}
	
}
