package com.nv.resumebuilder.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Org_Details")
public class OrganizationalDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "comName")
	@NotEmpty(message = "organization name is required")
	@Size(min = 1, max = 40, message = "organization name must be less then 40")
	private String comName;
	@NotNull(message = "designation is required")
	@Column(name = "designation")
	private String designation;

	@Column(name = "date")
	@NotNull(message = "Joining Date Required")
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date date;

	public OrganizationalDetailsEntity() {
		super();
	}

	public OrganizationalDetailsEntity(String comName, String designation, Date date) {
		super();
		this.comName = comName;
		this.designation = designation;
		this.date = date;
	}

	public OrganizationalDetailsEntity(Long id,
			@NotEmpty(message = "organization name is required") @Size(min = 1, max = 40, message = "organization name must be less then 40") String comName,
			@NotNull(message = "designation is required") String designation,
			@NotNull(message = "Joining Date Required") Date date) {
		super();
		this.id = id;
		this.comName = comName;
		this.designation = designation;
		this.date = date;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "OrganizationDetails [Company Name=" + comName + ", designation=" + designation + ", date=" + date + "]";
	}

}
