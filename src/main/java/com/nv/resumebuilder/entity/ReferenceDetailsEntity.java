package com.nv.resumebuilder.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@Entity

public class ReferenceDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @NotEmpty
	 @Size(min=10,max=30)
	  private String personName;
	 
	  @NotEmpty
	  @Size(min=2,max=20,message="Enter designation upto 20 characters!!")
	  private String designation;
	  
	  @NotEmpty
	  @Email(message = "Please enter valid email")
	  private String emailId;
	  
	  
	  @Pattern(regexp = "^[7-9][0-9]{9}$")
	  private String contactNo;
	  
	  @NotEmpty
	  @Size(min=10,max=100,message="Enter upto 100 characters")
	  private String address;
	  
	  @NotEmpty
	  @Size(max=40,message="Enter upto 40 characters")
	  private String organization;
	  
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
		return "ReferenceDetailsEntity [ personName=" + personName + ", designation=" + designation
				+ ", emailId=" + emailId + ", contactNo=" + contactNo + ", address=" + address + ", organization="
				+ organization + "]";
	}
	  

}
