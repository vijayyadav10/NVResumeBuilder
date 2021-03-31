package com.nv.resumebuilder.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumeTemplateEntity {
	
	private PersonalDetailsEntity personalDetailsEntity;
	private EducationalDetailsEntity educationalDetailsEntity;
	private ExperienceDetailsEntity experienceDetailsEntity;
	private List<ProjectDetailsEntity> projectDetailsEntity;
	private OrganizationalDetailsEntity organizationalDetailsEntity;
	private AchievementsAndHonoursEntity achievementsAndHonoursEntity;
	private List<ReferenceDetailsEntity> referenceDetailsEntity;

}
