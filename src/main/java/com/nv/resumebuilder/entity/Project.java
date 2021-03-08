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
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectId;
	@Column(name = "project_name")
	private String projectName;
	@Column(name = "project_description")
	private String projectDescription;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "experience_id")
	private ExperienceDetail experienceDetail;

	public ExperienceDetail getExperienceDetail() {
		return experienceDetail;
	}

	public void setExperienceDetail(ExperienceDetail experienceDetail) {
		this.experienceDetail = experienceDetail;
	}

	public Project() {
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
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
