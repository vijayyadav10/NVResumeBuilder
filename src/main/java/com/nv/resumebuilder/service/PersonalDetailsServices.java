package com.nv.resumebuilder.service;

import java.util.Optional;

import com.nv.resumebuilder.entity.PersonalDetailsEntity;

public interface PersonalDetailsServices 
{
	public PersonalDetailsEntity savePersonalDetails(PersonalDetailsEntity personalDetailsEntity);
	public Optional<PersonalDetailsEntity> findById(Long id);
}
