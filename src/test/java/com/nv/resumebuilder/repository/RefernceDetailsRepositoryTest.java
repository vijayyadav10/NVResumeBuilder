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
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.nv.resumebuilder.entity.ReferenceDetailsEntity;
@DataJpaTest
class RefernceDetailsRepositoryTest {
	@Autowired
	private TestEntityManager entityManager;
	
	
	@Autowired
	RefernceDetailsRepository repository;
	
	
	@Test
	void testSaveRepository()  {
		ReferenceDetailsEntity refernceEntity=new ReferenceDetailsEntity();
		refernceEntity.setPersonName("Rutuja bagade");
		refernceEntity.setDesignation("Software developer");
		refernceEntity.setEmailId("rutuja.bagade@newvisionsoftware.in");
		refernceEntity.setContactNo("9139251151");
		refernceEntity.setAddress("20,Ramcha got,Satara");
		refernceEntity.setOrganization("New vision softcom and consultancy,Pune");
         
        repository.save(refernceEntity);
         
        Assert.assertNotNull(refernceEntity.getId());
	}
	@Test
	public void testGetAllRefernceDetails(){
		ReferenceDetailsEntity refernceEntity=new ReferenceDetailsEntity();
		refernceEntity.setPersonName("Rutuja bagade");
		refernceEntity.setDesignation("Software developer");
		refernceEntity.setEmailId("rutuja.bagade@newvisionsoftware.in");
		refernceEntity.setContactNo("9139251151");
		refernceEntity.setAddress("20,Ramcha got,Satara");
		refernceEntity.setOrganization("New vision softcom and consultancy,Pune");
         
		
		ReferenceDetailsEntity refernceEntity1=new ReferenceDetailsEntity();
		refernceEntity1.setPersonName("Rutuja bagade");
		refernceEntity1.setDesignation("Software developer");
		refernceEntity1.setEmailId("rutuja.bagade@newvisionsoftware.in");
		refernceEntity1.setContactNo("9139251151");
		refernceEntity1.setAddress("20,Ramcha got,Satara");
		refernceEntity1.setOrganization("New vision softcom and consultancy,Pune");
         
		
		//Save both tickets in DB
		entityManager.persist(refernceEntity);
		entityManager.persist(refernceEntity1);
		
		Iterable<ReferenceDetailsEntity> refernceDetails = repository.findAll();
		List<ReferenceDetailsEntity> refernceDetailsList = new ArrayList<>();
		
		for (ReferenceDetailsEntity ticket : refernceDetails) {
			refernceDetailsList.add(ticket);
		}
		Assert.assertEquals(refernceDetailsList.size(),2);
	}
	@Test
	public void testDeleteRefernceDetailsById(){
		ReferenceDetailsEntity refernceEntity=new ReferenceDetailsEntity();
		refernceEntity.setPersonName("Rutuja bagade");
		refernceEntity.setDesignation("Software developer");
		refernceEntity.setEmailId("rutuja.bagade@newvisionsoftware.in");
		refernceEntity.setContactNo("9139251151");
		refernceEntity.setAddress("20,Ramcha got,Satara");
		refernceEntity.setOrganization("New vision softcom and consultancy,Pune");
         
		
		ReferenceDetailsEntity refernceEntity1=new ReferenceDetailsEntity();
		refernceEntity1.setPersonName("Rutuja bagade");
		refernceEntity1.setDesignation("Software developer");
		refernceEntity1.setEmailId("rutuja.bagade@newvisionsoftware.in");
		refernceEntity1.setContactNo("9139251151");
		refernceEntity1.setAddress("20,Ramcha got,Satara");
		refernceEntity1.setOrganization("New vision softcom and consultancy,Pune");
		//Save both tickets in DB
		ReferenceDetailsEntity persist = entityManager.persist(refernceEntity);
		entityManager.persist(refernceEntity1);
		
		//delete one ticket DB
		entityManager.remove(persist);
		
		Iterable<ReferenceDetailsEntity> refernceDetails = repository.findAll();
		List<ReferenceDetailsEntity> refernceDetailsList = new ArrayList<>();
		
		for (ReferenceDetailsEntity ticket : refernceDetailsList) {
			refernceDetailsList.add(ticket);
		}
		assertThat(refernceDetailsList.size()).isEqualTo(1);
	}
	@After
	public void tearDown() {
		entityManager.clear();
	}
}
