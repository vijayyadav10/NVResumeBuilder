package com.nv.resumebuilder.service;

import java.text.ParseException;

import org.springframework.web.bind.annotation.RequestParam;

import com.nv.resumebuilder.entity.PersonalDetailsEntity;

public interface PersonalDetailsServices 
{
	public PersonalDetailsEntity savePersonalDetails(PersonalDetailsEntity personalDetailsEntity);
}
