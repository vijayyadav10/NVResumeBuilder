package com.nv.resumebuilder.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nv.resumebuilder.validation.PastDate;

@Entity
@Table(name = "experiencedetails")
public class ExperienceDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long experienceId;

	@NotNull(message = "is required")
	@Size(min=1, message = "is required")
	@Column(name = "company_name")
	private String companyName;
	
	@NotNull(message = "is required")
	@Size(min=1, message = "is required")
	@Column(name = "designation")
	private String designation;
    
	@PastDate
	@Column(name = "joining_date")
	private Date joiningDate;
    
    @Column(name = "leaving_date")
	private Date leavingDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private PersonalDetailsEntity personalDetailsEntity;

    @JsonIgnore
	@OneToMany(mappedBy = "experienceDetail", cascade = CascadeType.ALL)
	private List<ProjectDetailsEntity> project;

	public ExperienceDetailsEntity() {
	}

	public Long getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(Long experienceId) {
		this.experienceId = experienceId;
	}

	public String getcompanyName() {
		return companyName;
	}

	public PersonalDetailsEntity getPersonalDetailsEntity() {
		return personalDetailsEntity;
	}

	public void setPersonalDetailsEntity(PersonalDetailsEntity personalDetailsEntity) {
		this.personalDetailsEntity = personalDetailsEntity;
	}

	public void setcompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getLeavingDate() {
		return leavingDate;
	}

	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}

	public List<ProjectDetailsEntity> getProjects() {
		return project;
	}

	public void setProjects(List<ProjectDetailsEntity> projects) {
		this.project = projects;
	}

	// add a convenience method
	public void addProject(ProjectDetailsEntity theProject) {
		if (project == null) {
			project = new ArrayList<>();
		}

		project.add(theProject);
	}

	@Override
	public String toString() {
		return "ExperienceDetail [experience_id=" + experienceId + ", companyName=" + companyName + ", designation="
				+ designation + ", joiningDate=" + joiningDate + ", leavingDate=" + leavingDate + "]";
	}

}