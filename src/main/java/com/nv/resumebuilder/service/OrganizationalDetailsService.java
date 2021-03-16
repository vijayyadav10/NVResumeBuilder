package com.nv.resumebuilder.service;

import com.nv.resumebuilder.entity.OrganizationalDetailsEntity;

public interface OrganizationalDetailsService {
	public OrganizationalDetailsEntity addorganizationDetailsServices(OrganizationalDetailsEntity details);
	public OrganizationalDetailsEntity findByOtherId(Long id);
}
