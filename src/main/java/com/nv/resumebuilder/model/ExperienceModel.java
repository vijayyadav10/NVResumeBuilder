package com.nv.resumebuilder.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.nv.resumebuilder.validation.PastDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExperienceModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long experienceId;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	@Column(name = "company_name")
	private String companyName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	@Column(name = "designation")
	private String designation;

	@PastDate
	@Column(name = "joining_date")
	private Date joiningDate;

	@Column(name = "leaving_date")
	private Date leavingDate;
//    @NotNull(message = "is required")
//	@Size(min = 1, message = "is required")
//	private String projectName;
//	
//    @NotNull(message = "is required")
//	@Size(min = 1, message = "is required")
//	private String projectDescription;

	
}
