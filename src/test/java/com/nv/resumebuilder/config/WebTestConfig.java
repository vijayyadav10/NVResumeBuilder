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
	public ExperienceDetailService theExperienceDetailService() {
		return Mockito.mock(ExperienceDetailService.class);
	}

	@Bean
	@Primary
	public ProjectService theProjectService() {
		return Mockito.mock(ProjectService.class);
	}

	@Bean
	@Primary
	public ExperienceDetailRepository theExperienceDetailRepository() {
		return Mockito.mock(ExperienceDetailRepository.class);
	}

	@Bean
	@Primary
	public ProjectRepository theProjectRepository() {
		return Mockito.mock(ProjectRepository.class);
	}

	@Bean
	@Primary
	public PastDateConstraintValidator dateValidator() {
		return new PastDateConstraintValidator();
	}

}
