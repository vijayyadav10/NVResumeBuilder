package com.nv.resumebuilder.model;

import java.util.Date;

public class OrganizationalDetailsModel {
	private String comName;
	private String designation;
	private Date date;

	public OrganizationalDetailsModel() {
		super();
	}

	public OrganizationalDetailsModel(String comName, String designation, Date date) {
		super();
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
		return "OrganizationDetails [comName=" + comName + ", designation=" + designation + ", date=" + date + "]";
	}

}
