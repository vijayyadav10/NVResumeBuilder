package com.nv.resumebuilder.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nv.resumebuilder.entity.EducationalDetailsEntity;

@Repository
public interface EducationalDetailsRepository extends CrudRepository<EducationalDetailsEntity, Long> {

}
