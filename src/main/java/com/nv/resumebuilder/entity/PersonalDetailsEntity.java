package com.nv.resumebuilder.entity;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Entity
@Table(name ="personaldetails")
public class PersonalDetailsEntity 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	@NotEmpty
	@Size(min = 1, max = 10, message = "size upto 10 Characters..")
	private String userFirstName;
	
	@Column
	@NotEmpty
	@Size(min = 1, max = 10, message = "size upto 10 Characters..")
	private String userMiddleName;
	
	@Column
	@NotEmpty
	@Size(min = 1, max = 10, message = "size upto 10 Characters..")
	private String userLastName;
	
	@Column
	//@DateTimeFormat(pattern ="dd/mm/yyyy")
	@Temporal(TemporalType.DATE)
	//@CreationTimestamp
	@NotNull
	@Past
	private LocalDate birthDate;
	
	@Column
	@NotEmpty
	private String nationality;
	
	@Column
	@NotNull(message = "Select gender")
	@NotEmpty
	private String gender;
	
	@Column
	@NotEmpty
	private String maritialStatus;

	@Column
	@NotNull(message = "is required")
	@Email(message = "Invalid email! Please enter valid email")
	private String emailId;
	
	@Column
	@NotNull(message = "is required")
	@Email(message = "Invalid email! Please enter valid email")
	private String linkedinId;
	
	@Column
	@NotNull(message = "is required")
	@Email(message = "Invalid email! Please enter valid email")
	private String skypeId;

	@Column
	@NotEmpty
	@Pattern(regexp="(^$|[0-9]{10})")
	private String phoneNo;
	
	@Column
	@NotEmpty
	private String currentAddress;
	
	
	
	@Column
	@NotEmpty
	private String city;
	@Column
	@NotEmpty
	private String country;
	
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column
	@NotEmpty(message = "Select at least one language.")
	private String languageKnown;

	public long getId() 
	{
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserMiddleName() {
		return userMiddleName;
	}

	public void setUserMiddleName(String userMiddleName) {
		this.userMiddleName = userMiddleName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritialStatus() {
		return maritialStatus;
	}

	public void setMaritialStatus(String maritialStatus) {
		this.maritialStatus = maritialStatus;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getLinkedinId() {
		return linkedinId;
	}

	public void setLinkedinId(String linkedinId) {
		this.linkedinId = linkedinId;
	}

	public String getSkypeId() {
		return skypeId;
	}

	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}


	public String getLanguageKnown() {
		return languageKnown;
	}

	public void setLanguageKnown(String languageKnown) {
		this.languageKnown = languageKnown;
	}

	
	public PersonalDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public PersonalDetailsEntity(
			@NotEmpty @Size(min = 1, max = 10, message = "size upto 10 Characters..") String userFirstName,
			@NotEmpty @Size(min = 1, max = 10, message = "size upto 10 Characters..") String userMiddleName,
			@NotEmpty @Size(min = 1, max = 10, message = "size upto 10 Characters..") String userLastName,
			@NotNull LocalDate birthDate, @NotEmpty String nationality,
			@NotNull(message = "Select gender") @NotEmpty String gender, @NotEmpty String maritialStatus,
			@NotNull(message = "is required") @Email(message = "Invalid email! Please enter valid email") String emailId,
			@NotNull(message = "is required") @Email(message = "Invalid email! Please enter valid email") String linkedinId,
			@NotNull(message = "is required") @Email(message = "Invalid email! Please enter valid email") String skypeId,
			@NotEmpty @Pattern(regexp = "(^$|[0-9]{10})") String phoneNo, @NotEmpty String currentAddress,
			@NotEmpty String city, @NotEmpty String country,
			@NotEmpty(message = "Select at least one language.") String languageKnown) {
		super();
		this.userFirstName = userFirstName;
		this.userMiddleName = userMiddleName;
		this.userLastName = userLastName;
		this.birthDate = birthDate;
		this.nationality = nationality;
		this.gender = gender;
		this.maritialStatus = maritialStatus;
		this.emailId = emailId;
		this.linkedinId = linkedinId;
		this.skypeId = skypeId;
		this.phoneNo = phoneNo;
		this.currentAddress = currentAddress;
		this.city = city;
		this.country = country;
		this.languageKnown = languageKnown;
	}

	@Override
	public String toString() {
		return "PersonalDetailsEntity [id=" + id + ", userFirstName=" + userFirstName + ", userMiddleName="
				+ userMiddleName + ", userLastName=" + userLastName + ", birthDate=" + birthDate + ", nationality="
				+ nationality + ", gender=" + gender + ", maritialStatus=" + maritialStatus + ", emailId=" + emailId
				+ ", linkedinId=" + linkedinId + ", skypeId=" + skypeId + ", phoneNo=" + phoneNo + ", currentAddress="
				+ currentAddress +  ", city=" + city + ", country=" + country
				+ ", languageKnown=" + languageKnown + "]";
	}

	
}

/*PersonalDetailsEntity personalDetailsEntity=new PersonalDetailsEntity
					("userFirstName","userMiddleName","userLastName","birthDate",
							"nationality","gender","maritialStatus","emailId","linkedinId",
							"skypeId","phoneNo","currentAddress","city","country","languageKnown");
*/