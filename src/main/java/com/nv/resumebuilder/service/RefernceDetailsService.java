package com.nv.resumebuilder.service;

import java.util.List;


import com.nv.resumebuilder.entity.ReferenceDetailsEntity;

public interface RefernceDetailsService {
	 public ReferenceDetailsEntity saveRefernceDetails( ReferenceDetailsEntity refernceDetails);
	 public List<ReferenceDetailsEntity> getAllRefernceDetails();
	 
	 public ReferenceDetailsEntity getRefernceDetailsById(int id);
	 
	 public void deleteRefernceDetails(int id);
}
