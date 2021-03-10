package com.nv.resumebuilder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
//@Table(name = "projects")
public class ProjectDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long projectId;
	@Column(name = "project_name")
	private String projectName;
	@Column(name = "project_description")
	private String projectDescription;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "experience_id")
	private ExperienceDetailsEntity experienceDetail;

	public ExperienceDetailsEntity getExperienceDetail() {
		return experienceDetail;
	}

	public void setExperienceDetail(ExperienceDetailsEntity experienceDetail) {
		this.experienceDetail = experienceDetail;
	}

	public ProjectDetailsEntity() {
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectDescription="
				+ projectDescription + "]";
	}

}
