package com.nv.resumebuilder.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class OrganizationalDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "comName")
	@NotEmpty(message = "organization name is required")
	@Size(min = 1, max = 40, message = "organization name must be less then 40")
	private String comName;
	@NotNull(message = "designation is required")
	@Column(name = "designation")
	private String designation;

	@NotNull(message = "Joining Date Required")
	@Column(name = "date")
	private String date;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "personal_id")
	private PersonalDetailsEntity personalDetailsEntity;
	
	public OrganizationalDetailsEntity() {
		super();
	}

	public OrganizationalDetailsEntity(String comName, String designation, String date) {
		super();
		this.comName = comName;
		this.designation = designation;
		this.date = date;
	}

	public OrganizationalDetailsEntity(Long id,
			@NotEmpty(message = "organization name is required") @Size(min = 1, max = 40, message = "organization name must be less then 40") String comName,
			@NotNull(message = "designation is required") String designation,
			@NotNull(message = "Joining Date Required") String date) {
		super();
		this.id = id;
		this.comName = comName;
		this.designation = designation;
		this.date = date;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PersonalDetailsEntity getPersonalDetailsEntity() {
		return personalDetailsEntity;
	}

	public void setPersonalDetailsEntity(PersonalDetailsEntity personalDetailsEntity) {
		this.personalDetailsEntity = personalDetailsEntity;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "OrganizationDetails [Company Name=" + comName + ", designation=" + designation + ", date=" + date + "]";
	}

}
