package com.nv.resumebuilder.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.nv.resumebuilder.entity.ExperienceDetailsEntity;
import com.nv.resumebuilder.entity.ProjectDetailsEntity;
import com.nv.resumebuilder.repository.ExperienceDetailRepository;

@RunWith(MockitoJUnitRunner.class)
public class ExperienceDetailServiceTest {

	@Mock
	private ExperienceDetailRepository repository;

	@InjectMocks
	private ExperienceDetailServiceImpl theExperienceDetailService;

	@Test
	public void testSavingExperienceDetail() {
		ExperienceDetailsEntity theExperienceDetail = new ExperienceDetailsEntity();

		// GIVEN
		theExperienceDetail.setExperienceId(Long.valueOf(1));
		theExperienceDetail.setcompanyName("Nokia");
		theExperienceDetail.setDesignation("Android Developer");
		theExperienceDetail.setJoiningDate(Date.valueOf("2015-03-31"));
		theExperienceDetail.setLeavingDate(Date.valueOf("2020-03-31"));

		ProjectDetailsEntity theProject = new ProjectDetailsEntity();
		theProject.setProjectId(Long.valueOf(1));
		theProject.setProjectName("Nokia app");
		theProject.setProjectDescription("Nokia app that can handle sensors");

		ArrayList<ProjectDetailsEntity> project = new ArrayList<ProjectDetailsEntity>();
		project.add(theProject);

		theExperienceDetail.setProjects(project);

		// WHEN
		when(theExperienceDetailService.save(theExperienceDetail))

				// THEN
				.thenReturn(theExperienceDetail);

		assertEquals(theExperienceDetail, theExperienceDetailService.save(theExperienceDetail));
	}

	@Test
	public void testSavingExperienceDetailWithMissingValues() {
		ExperienceDetailsEntity theExperienceDetailUserGiven = new ExperienceDetailsEntity();
		ExperienceDetailsEntity theExperienceDetailSystemWants = new ExperienceDetailsEntity();

		theExperienceDetailSystemWants.setExperienceId(Long.valueOf(1));
		theExperienceDetailSystemWants.setcompanyName("Nokia");
		theExperienceDetailSystemWants.setDesignation("");
		theExperienceDetailSystemWants.setJoiningDate(Date.valueOf("2015-03-31"));
		theExperienceDetailSystemWants.setLeavingDate(Date.valueOf("2020-03-31"));

		ProjectDetailsEntity theProjectSystemWants = new ProjectDetailsEntity();
		theProjectSystemWants.setProjectId(Long.valueOf(1));
		theProjectSystemWants.setProjectName("Nokia app");
		theProjectSystemWants.setProjectDescription("Nokia app that can handle sensors");

		ArrayList<ProjectDetailsEntity> projectSystemWants = new ArrayList<ProjectDetailsEntity>();
		projectSystemWants.add(theProjectSystemWants);

		theExperienceDetailSystemWants.setProjects(projectSystemWants);

		// GIVEN
		theExperienceDetailUserGiven.setExperienceId(Long.valueOf(1));
		theExperienceDetailUserGiven.setcompanyName("Nokia");
		theExperienceDetailUserGiven.setDesignation("Android Developer");
		theExperienceDetailUserGiven.setJoiningDate(Date.valueOf("2015-03-31"));
		theExperienceDetailUserGiven.setLeavingDate(Date.valueOf("2020-03-31"));

		ProjectDetailsEntity theProject = new ProjectDetailsEntity();
		theProject.setProjectId(Long.valueOf(1));
		theProject.setProjectName("Nokia app");
		theProject.setProjectDescription("Nokia app that can handle sensors");

		ArrayList<ProjectDetailsEntity> project = new ArrayList<ProjectDetailsEntity>();
		project.add(theProject);

		theExperienceDetailUserGiven.setProjects(project);

		// WHEN
		when(theExperienceDetailService.save(theExperienceDetailUserGiven))

				// THEN
				.thenReturn(theExperienceDetailUserGiven);

		assertNotEquals(theExperienceDetailSystemWants, theExperienceDetailService.save(theExperienceDetailUserGiven));
	}

}