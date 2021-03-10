package com.nv.resumebuilder.serviceimpl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.resumebuilder.entity.PersonalDetailsEntity;
import com.nv.resumebuilder.repository.PersonalDetailsRepository;
import com.nv.resumebuilder.service.PersonalDetailsServices;

@Service
public class PersonalDetailServiceImpl implements PersonalDetailsServices
{

	@Autowired
	private PersonalDetailsRepository personalDetailsRepository;
	
	@Override
	public PersonalDetailsEntity savePersonalDetails(PersonalDetailsEntity personalDetailsEntity) 
	{
		return personalDetailsRepository.save(personalDetailsEntity);// saving our data in h2 database
	}

	@Override
	public Optional<PersonalDetailsEntity> findById(Long id) 
	{
		return personalDetailsRepository.findById(id);
	}
	

}
