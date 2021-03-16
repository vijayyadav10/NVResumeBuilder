/**
 * @Repository:- repository is a mechanism for encapsulating storage, 
 * retrieval, and search behavior which emulates a collection of objects.
 */

package com.nv.resumebuilder.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nv.resumebuilder.entity.PersonalDetailsEntity;

@Repository
public interface PersonalDetailsRepository extends CrudRepository<PersonalDetailsEntity, Long> {

}