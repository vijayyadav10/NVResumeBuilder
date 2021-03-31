package com.nv.resumebuilder.service;

import java.util.Optional;

import com.nv.resumebuilder.entity.OrganizationalDetailsEntity;

public interface OrganizationalDetailsService {
	public OrganizationalDetailsEntity addorganizationDetailsServices(OrganizationalDetailsEntity details);
	public Optional<OrganizationalDetailsEntity> findByOtherId(Long id);
}
