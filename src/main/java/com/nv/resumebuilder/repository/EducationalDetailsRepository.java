package com.nv.resumebuilder.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nv.resumebuilder.entity.EducationalDetailsEntity;

@Repository
public interface EducationalDetailsRepository extends CrudRepository<EducationalDetailsEntity, Long> {
	@Query(value = "SELECT * FROM EDUCATIONAL_DETAILS_ENTITY  where PERSONAL_DETAILS_ENTITY_ID =?", nativeQuery = true)
	EducationalDetailsEntity findByPersonId( @Param("id") Long id);
}
