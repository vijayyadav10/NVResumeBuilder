package com.nv.resumebuilder.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nv.resumebuilder.entity.ReferenceDetailsEntity;
import com.nv.resumebuilder.repository.RefernceDetailsRepository;
import com.nv.resumebuilder.service.RefernceDetailsService;

@Service
public class RefernceDetailsServiceImpl implements RefernceDetailsService {
	@Autowired
	private RefernceDetailsRepository repository;

	public ReferenceDetailsEntity saveRefernceDetails(ReferenceDetailsEntity refernceDetails) {
		return repository.save(refernceDetails);
	}

	@Override
	public List<ReferenceDetailsEntity> getAllRefernceDetails(long id) {
		return repository.findAllById(id);
	}

	@Override
	public ReferenceDetailsEntity getRefernceDetailsById(long i) {
		return repository.findById(i).orElse(null);
	}

	@Override
	public void deleteRefernceDetails(long id) {

		repository.deleteById(id);
	}

}
