package com.nv.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nv.resumebuilder.entity.ExperienceDetailsEntity;

public interface ExperienceDetailRepository extends JpaRepository<ExperienceDetailsEntity, Long>{

}
