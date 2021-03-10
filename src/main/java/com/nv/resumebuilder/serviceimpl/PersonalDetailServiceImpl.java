package com.nv.resumebuilder.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.resumebuilder.entity.PersonalDetailsEntity;
import com.nv.resumebuilder.repository.PersonalDetailsRepository;
import com.nv.resumebuilder.service.PersonalDetailsServices;

@Service
public class PersonalDetailServiceImpl implements PersonalDetailsServices {

	@Autowired
	private PersonalDetailsRepository personalDetailsRepository;

	@Override
	public PersonalDetailsEntity savePersonalDetails(PersonalDetailsEntity personalDetailsEntity) {
		return personalDetailsRepository.save(personalDetailsEntity);// saving our data in h2 database

	}
	@Override
	public PersonalDetailsEntity findById(Long theId) {
		Optional<PersonalDetailsEntity> result = this.personalDetailsRepository.findById(theId);

		PersonalDetailsEntity thePersonalDetailsEntity = null;

		if (result.isPresent()) {
			thePersonalDetailsEntity = result.get();
		} else {
			throw new RuntimeException("Did not find employee id - " + theId);
		}

		return thePersonalDetailsEntity;
	}

}
