package com.nv.resumebuilder.service;

import java.util.List;

import com.nv.resumebuilder.entity.OrganizationalDetailsEntity;

public interface OrganizationalDetailsService {
	public OrganizationalDetailsEntity addorganizationDetailsServices(OrganizationalDetailsEntity details);
	public OrganizationalDetailsEntity findByOtherId(Long id);
	public List<OrganizationalDetailsEntity> getAllOrganizationalDetails();
}
