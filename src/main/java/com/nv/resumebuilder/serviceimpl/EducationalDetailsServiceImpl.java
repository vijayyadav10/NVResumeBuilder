package com.nv.resumebuilder.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.resumebuilder.entity.EducationalDetailsEntity;
import com.nv.resumebuilder.entity.PersonalDetailsEntity;
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
	public EducationalDetailsEntity findByPersonId(long id) {
		Optional<EducationalDetailsEntity> result = Optional
				.ofNullable(this.educationalDetailsRepository.findByPersonId(id));

		EducationalDetailsEntity educationalDetailsEntity = null;

		if (result.isPresent()) {
			educationalDetailsEntity = result.get();
		} else {
			throw new RuntimeException("Did not find employee id - " + id);
		}

		return educationalDetailsEntity;
	}

}
