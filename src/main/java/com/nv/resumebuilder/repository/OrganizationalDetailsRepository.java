package com.nv.resumebuilder.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nv.resumebuilder.entity.OrganizationalDetailsEntity;

@Repository
public interface OrganizationalDetailsRepository extends CrudRepository<OrganizationalDetailsEntity, Long> {

}
