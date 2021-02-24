package com.nv.resumebuilder.serviceimpl;

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
	public void personalDetailsStore(PersonalDetailsEntity personalDetailsEntity) 
	{
		personalDetailsRepository.save(personalDetailsEntity);// saving our data in h2 database
		
	}
	

}
