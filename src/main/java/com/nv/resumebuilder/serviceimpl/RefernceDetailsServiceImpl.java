package com.nv.resumebuilder.serviceimpl;

import java.util.List;
import java.util.Optional;

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
	public List<ReferenceDetailsEntity> getAllRefernceDetails() {
		
		return (List<ReferenceDetailsEntity>) repository.findAll();
	}

	@Override
	public ReferenceDetailsEntity getRefernceDetailsById(int i) {
		
		ReferenceDetailsEntity refernceEntity=repository.findById(i).orElse(null);
		return refernceEntity;
	}

	@Override
	public void deleteRefernceDetails(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
