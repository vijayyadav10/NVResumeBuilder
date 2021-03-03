package com.nv.resumebuilder.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import javax.activation.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.nv.resumebuilder.entity.OrganizationalDetailsEntity;

@Configuration
@PropertySource("application.properties")
@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class OrganizationalDetailsRepositoryTest {

	@Autowired
	private Environment env;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));

		return (DataSource) dataSource;
	}

	@MockBean
	private OrganizationalDetailsEntity organizationdetailsEntity;

	@MockBean
	private OrganizationalDetailsRepository orgRepository;

	@Test
	public void testDataSource() {
		long id = 1;
		String comName = "NV";
		String designation = "tester";
		@SuppressWarnings("deprecation")
		Date date = new Date(2021, 22, 11);
		organizationdetailsEntity = new OrganizationalDetailsEntity(id, comName, designation, date);
		orgRepository.save(organizationdetailsEntity);
		long i = orgRepository.count();
		System.out.println(i);
		assertEquals("NV",organizationdetailsEntity.getComName());
	}
}
