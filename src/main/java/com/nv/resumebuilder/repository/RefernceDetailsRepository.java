package com.nv.resumebuilder.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nv.resumebuilder.entity.ReferenceDetailsEntity;


@Repository
public interface RefernceDetailsRepository extends CrudRepository<ReferenceDetailsEntity, Integer> {



	

}
