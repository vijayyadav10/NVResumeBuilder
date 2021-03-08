package com.nv.resumebuilder.dto;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ReferenceDetailsDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty
	@Size(min = 10, max = 30)
	private String personName;

	@NotEmpty
	@Size(min = 2, max = 20, message = "Enter designation upto 20 characters!!")
	private String designation;

	@NotEmpty
	@Email(message = "Please enter valid email")
	private String emailId;

	@Pattern(regexp = "^[7-9][0-9]{9}$")
	private String contactNo;

	@NotEmpty
	@Size(min = 10, max = 100, message = "Enter upto 100 characters")
	private String address;

	@NotEmpty
	@Size(max = 40, message = "Enter upto 40 characters")
	private String organization;

	public ReferenceDetailsDto(Integer i, String personName, String designation, String emailId, String contactNo,
			String address, String organization) {

		this.id = i;
		this.personName = personName;
		this.designation = designation;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.address = address;
		this.organization = organization;
	}

	public ReferenceDetailsDto() {

	}

	public ReferenceDetailsDto(String personName, String designation, String emailId, String contactNo, String address,
			String organization) {

		this.personName = personName;
		this.designation = designation;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.address = address;
		this.organization = organization;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	@Override
	public String toString() {
		return "ReferenceDetailsEntity [ personName=" + personName + ", designation=" + designation + ", emailId="
				+ emailId + ", contactNo=" + contactNo + ", address=" + address + ", organization=" + organization
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((organization == null) ? 0 : organization.hashCode());
		result = prime * result + ((personName == null) ? 0 : personName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReferenceDetailsDto other = (ReferenceDetailsDto) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contactNo == null) {
			if (other.contactNo != null)
				return false;
		} else if (!contactNo.equals(other.contactNo))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (organization == null) {
			if (other.organization != null)
				return false;
		} else if (!organization.equals(other.organization))
			return false;
		if (personName == null) {
			if (other.personName != null)
				return false;
		} else if (!personName.equals(other.personName))
			return false;
		return true;
	}

}
