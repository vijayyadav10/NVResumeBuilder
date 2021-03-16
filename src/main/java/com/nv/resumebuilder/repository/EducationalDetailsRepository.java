package com.nv.resumebuilder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nv.resumebuilder.entity.EducationalDetailsEntity;

@Repository
public interface EducationalDetailsRepository extends CrudRepository<EducationalDetailsEntity, Long> {

	@Query(value = "select * from educationaldetails e where e.personal_details_entity_id =?", nativeQuery = true)
	public Optional <EducationalDetailsEntity> findByperson_id( @Param("id") Long id);
	
}
