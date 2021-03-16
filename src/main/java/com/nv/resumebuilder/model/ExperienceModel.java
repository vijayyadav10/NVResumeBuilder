package com.nv.resumebuilder.model;

import java.sql.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.nv.resumebuilder.validation.PastDate;

public class ExperienceModel {

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String companyName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String designation;

	@PastDate
	private Date joiningDate;

	private Date leavingDate;

//    @NotNull(message = "is required")
//	@Size(min = 1, message = "is required")
//	private String projectName;
//	
//    @NotNull(message = "is required")
//	@Size(min = 1, message = "is required")
//	private String projectDescription;

	public ExperienceModel() {
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
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

	@Override
	public String toString() {
		return "ExperienceProject [companyName=" + companyName + ", designation=" + designation + ", joiningDate="
				+ joiningDate + ", leavingDate=" + leavingDate + "]";
	}

//	public String getProjectName() {
//		return projectName;
//	}
//
//	public void setProjectName(String projectName) {
//		this.projectName = projectName;
//	}

//	public String getProjectDescription() {
//		return projectDescription;
//	}
//
//	public void setProjectDescription(String projectDescription) {
//		this.projectDescription = projectDescription;
//	}

//	@Override
//	public String toString() {
//		return "ExperienceProject [companyName=" + companyName + ", designation=" + designation + ", joiningDate="
//				+ joiningDate + ", leavingDate=" + leavingDate + ", projectName=" + projectName
//				+ ", projectDescription=" + projectDescription + "]";
//	}

}
