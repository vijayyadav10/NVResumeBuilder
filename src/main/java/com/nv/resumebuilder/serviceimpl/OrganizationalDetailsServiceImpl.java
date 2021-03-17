package com.nv.resumebuilder.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.resumebuilder.entity.AchievementsAndHonoursEntity;
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
	public OrganizationalDetailsEntity findByOtherId(Long id) {
		// TODO Auto-generated method stub
		Optional<OrganizationalDetailsEntity> result = Optional
				.ofNullable(this.organizationRepository.findBypersonid(id));

		OrganizationalDetailsEntity organizationalDetailsEntity = null;

		if (result.isPresent()) {
			organizationalDetailsEntity = result.get();
		} else {
			throw new RuntimeException("Did not find employee id - " + id);
		}

		return organizationalDetailsEntity;
	}

	
}
