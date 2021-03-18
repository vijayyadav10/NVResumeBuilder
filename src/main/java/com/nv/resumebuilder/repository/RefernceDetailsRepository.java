package com.nv.resumebuilder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nv.resumebuilder.entity.ReferenceDetailsEntity;

@Repository
public interface RefernceDetailsRepository extends JpaRepository<ReferenceDetailsEntity, Long> {
	@Query(value = "select * from referncedetails b where b.PERSONALDETAILS_ID =?", nativeQuery = true)
	List<ReferenceDetailsEntity> findAllById( @Param("id") Long id);
}
