package com.nv.resumebuilder.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.resumebuilder.entity.ExperienceDetailsEntity;
import com.nv.resumebuilder.repository.ExperienceDetailRepository;
import com.nv.resumebuilder.service.ExperienceDetailService;

@Service
public class ExperienceDetailServiceImpl implements ExperienceDetailService {

	private ExperienceDetailRepository experienceDetailRepository;

	@Autowired
	public ExperienceDetailServiceImpl(ExperienceDetailRepository theExperienceDetailRepository) {
		this.experienceDetailRepository = theExperienceDetailRepository;
	}

	@Override
	public ExperienceDetailsEntity findById(Long theId) {
		Optional<ExperienceDetailsEntity> result = this.experienceDetailRepository.findById(theId);

		ExperienceDetailsEntity theExperienceDetail = null;

		if (result.isPresent()) {
			theExperienceDetail = result.get();
		} else {
			throw new RuntimeException("Did not find employee id - " + theId);
		}

		return theExperienceDetail;
	}

	@Override
	public ExperienceDetailsEntity save(ExperienceDetailsEntity theExperienceDetail) {
		return this.experienceDetailRepository.save(theExperienceDetail);
	}

	@Override
	public void deleteById(Long theId) {
		this.experienceDetailRepository.deleteById(theId);
	}

	@Override
	public ExperienceDetailsEntity findByOtherId(Long id) {
		Optional<ExperienceDetailsEntity> result = Optional
				.ofNullable(this.experienceDetailRepository.findByperson_id(id));

		ExperienceDetailsEntity experienceDetailsEntity = null;

		if (result.isPresent()) {
			experienceDetailsEntity = result.get();
		} else {
			throw new RuntimeException("Did not find employee id - " + id);
		}

		return experienceDetailsEntity;
	}

}

/*
 * "Optional" is different pattern instead of having to check for nulls. feature
 * introduced in java 8. the JPA repo make use of optional for checking null.
 */