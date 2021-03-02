package com.nv.resumebuilder.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.resumebuilder.entity.OrganizationalDetailsEntity;
import com.nv.resumebuilder.repository.OrganizationalDetailsRepository;
import com.nv.resumebuilder.service.OrganizationalDetailsService;

@Service
public class OrganizationalDetailsServiceImpl implements OrganizationalDetailsService {
	@Autowired
	private OrganizationalDetailsRepository organizationRepository;

	@Override
	public OrganizationalDetailsEntity addorganizationDetailsServices(
			OrganizationalDetailsEntity organizationdetailsEntity) {
		OrganizationalDetailsEntity count = organizationRepository.save(organizationdetailsEntity);
		return organizationdetailsEntity;
	}

	public List<OrganizationalDetailsEntity> allDetails() {
		return null;

	}
}
