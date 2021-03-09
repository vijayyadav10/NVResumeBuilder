package com.nv.resumebuilder.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.resumebuilder.entity.ExperienceDetail;
import com.nv.resumebuilder.repository.ExperienceDetailRepository;

@Service
public class ExperienceDetailServiceImpl implements ExperienceDetailService {

	private ExperienceDetailRepository experienceDetailRepository;

	@Autowired
	public ExperienceDetailServiceImpl(ExperienceDetailRepository theExperienceDetailRepository) {
		this.experienceDetailRepository = theExperienceDetailRepository;
	}

	@Override
	public List<ExperienceDetail> findAll() {
		return this.experienceDetailRepository.findAll();
	}

	@Override
	public ExperienceDetail findById(int theId) {
		Optional<ExperienceDetail> result = this.experienceDetailRepository.findById(theId);

		ExperienceDetail theExperienceDetail = null;

		if (result.isPresent()) {
			theExperienceDetail = result.get();
		} else {
			throw new RuntimeException("Did not find employee id - " + theId);
		}

		return theExperienceDetail;
	}

	@Override
	public ExperienceDetail save(ExperienceDetail theExperienceDetail) {
		return this.experienceDetailRepository.save(theExperienceDetail);
	}

	@Override
	public void deleteById(int theId) {
		this.experienceDetailRepository.deleteById(theId);
	}

}

/*
 * "Optional" is different pattern instead of having to check for nulls. feature
 * introduced in java 8. the JPA repo make use of optional for checking null.
 */
