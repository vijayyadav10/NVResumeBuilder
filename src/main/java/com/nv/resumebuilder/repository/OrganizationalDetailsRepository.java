package com.nv.resumebuilder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nv.resumebuilder.entity.OrganizationalDetailsEntity;

@Repository
public interface OrganizationalDetailsRepository extends CrudRepository<OrganizationalDetailsEntity, Long> {
	@Query(value = "select * from organization_details a where a.personal_id =?", nativeQuery = true)
	public Optional <OrganizationalDetailsEntity> findBypersonid( @Param("id") Long id);
}
