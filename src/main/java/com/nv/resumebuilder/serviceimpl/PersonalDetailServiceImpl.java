package com.nv.resumebuilder.serviceimpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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
	

}
