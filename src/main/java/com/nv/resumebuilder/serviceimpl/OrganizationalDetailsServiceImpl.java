package com.nv.resumebuilder.serviceimpl;

import java.util.Optional;

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
		organizationRepository.save(organizationdetailsEntity);
		return organizationdetailsEntity;
	}

	@Override
	public OrganizationalDetailsEntity findByOtherId(Long id) 
	{
		Optional <OrganizationalDetailsEntity> organizationalDetailsEntityOptional=organizationRepository.findBypersonid(id);
		OrganizationalDetailsEntity organizationdetailsEntity=organizationalDetailsEntityOptional.get();
		return organizationdetailsEntity;
	}
}
