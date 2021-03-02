package com.nv.resumebuilder.repository;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.nv.resumebuilder.entity.ReferenceDetailsEntity;
@ExtendWith(SpringExtension.class)
@DataJpaTest
class RefernceDetailsRepositoryTest {
	@Autowired
	private TestEntityManager entityManager;
	
	
	@Autowired
	RefernceDetailsRepository repository;
	
	
	@Test
	@DisplayName("Saving data into Repository")
	void testSaveRepository()  {
		ReferenceDetailsEntity refernceEntity =repository.save(new ReferenceDetailsEntity("Rutuja bagade","Software developer",
				"rutuja.bagade@newvisionsoftware.in"
				,"9139251151","20,Ramcha got,Satara","New vision softcom and consultancy,Pune"));
         
        Assert.assertNotNull(refernceEntity.getId());
        assertThat(refernceEntity).hasFieldOrPropertyWithValue("personName", "Rutuja bagade");
        assertThat(refernceEntity).hasFieldOrPropertyWithValue("designation", "Software developer");
        assertThat(refernceEntity).hasFieldOrPropertyWithValue("contactNo", "9139251151");
       
	}
	@Test
	@DisplayName("Show all  data from Repository")
	public void testGetAllRefernceDetails(){
		Iterable<ReferenceDetailsEntity> refernceDetails = repository.findAll();

	    assertThat(refernceDetails).isEmpty();
	    //Save both data in DB
	    ReferenceDetailsEntity refernceEntity1 =repository.save(new ReferenceDetailsEntity("Rutuja bagade","Software developer",
				"rutuja.bagade@newvisionsoftware.in"
				,"9139251151","20,Ramcha got,Satara","New vision softcom and consultancy,Pune"));
	    
		entityManager.persist(refernceEntity1);
		ReferenceDetailsEntity refernceEntity2 =repository.save(new ReferenceDetailsEntity("Rutuja bagade","Software developer",
				"rutuja.bagade@newvisionsoftware.in"
				,"9139251151","20,Ramcha got,Satara","New vision softcom and consultancy,Pune"));
		entityManager.persist(refernceEntity2);
		
		Iterable<ReferenceDetailsEntity> refernceDetails1 = repository.findAll();
		List<ReferenceDetailsEntity> refernceDetailsList = new ArrayList<>();
		
		for (ReferenceDetailsEntity refernceData : refernceDetails1) {
			refernceDetailsList.add(refernceData);
		}
		
		assertThat(refernceDetails1).hasSize(2).contains(refernceEntity1, refernceEntity2);
		
	}
	@Test
	@DisplayName("Delete data based on id")
	public void testDeleteRefernceDetailsById(){
		//Save both data in DB
	    ReferenceDetailsEntity refernceEntity1 =repository.save(new ReferenceDetailsEntity("Rutuja bagade","Software developer",
				"rutuja.bagade@newvisionsoftware.in"
				,"9139251151","20,Ramcha got,Satara","New vision softcom and consultancy,Pune"));
	    
		entityManager.persist(refernceEntity1);
		ReferenceDetailsEntity refernceEntity2 =repository.save(new ReferenceDetailsEntity("Rutuja bagade","Software developer",
				"rutuja.bagade@newvisionsoftware.in"
				,"9139251151","20,Ramcha got,Satara","New vision softcom and consultancy,Pune"));
		entityManager.persist(refernceEntity2);
		
		//Save both tickets in DB
	    entityManager.persist(refernceEntity1);
		entityManager.persist(refernceEntity2);
		
		//delete one ticket DB
		entityManager.remove(refernceEntity2);
		
		Iterable<ReferenceDetailsEntity> refernceDetails = repository.findAll();
		
		assertThat(refernceDetails).hasSize(1).contains(refernceEntity1);
	}
	}
	

