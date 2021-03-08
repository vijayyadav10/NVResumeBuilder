package com.nv.resumebuilder.config;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.nv.resumebuilder.repository.PersonalDetailsRepository;
import com.nv.resumebuilder.service.PersonalDetailsServices;

@Profile("web")
@Configuration
public class WebTestConfig {

	@Bean
	@Primary
	public PersonalDetailsServices service() {
		return Mockito.mock(PersonalDetailsServices.class);
	}

	@Bean
	@Primary
	public PersonalDetailsRepository repository() {
		return Mockito.mock(PersonalDetailsRepository.class);
	}

}
