package com.nv.resumebuilder.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "personaldetails")
public class PersonalDetailsEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PersonalDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public ExperienceDetailsEntity getExperienceDetail() {
		return experienceDetail;
	}

	public void setExperienceDetail(ExperienceDetailsEntity experienceDetail) {
		this.experienceDetail = experienceDetail;
	}

	public PersonalDetailsEntity(long id,
			@NotEmpty @Size(min = 1, max = 10, message = "size upto 10 Characters..") String userFirstName,
			@NotEmpty String about,
			@NotEmpty @Size(min = 1, max = 10, message = "size upto 10 Characters..") String userMiddleName,
			@NotEmpty @Size(min = 1, max = 10, message = "size upto 10 Characters..") String userLastName,
			@NotNull(message = "is required") String birthDate, @NotEmpty String nationality,
			@NotNull(message = "Select gender") @NotEmpty String gender, @NotEmpty String maritialStatus,
			@NotNull(message = "is required") @Email(message = "Invalid email! Please enter valid email") String emailId,
			@NotNull(message = "is required") @Email(message = "Invalid email! Please enter valid email") String linkedinId,
			@NotNull(message = "is required") @Email(message = "Invalid email! Please enter valid email") String skypeId,
			@NotEmpty @Pattern(regexp = "(^$|[0-9]{10})") String phoneNo, @NotEmpty String currentAddress,
			@NotEmpty String city, @NotEmpty String country, ExperienceDetailsEntity experienceDetail,
			@NotEmpty(message = "Select at least one language.") String languageKnown) {
		super();
		this.id = id;
		this.userFirstName = userFirstName;
		this.about = about;
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
		this.experienceDetail = experienceDetail;
		this.languageKnown = languageKnown;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	@NotEmpty
	@Size(min = 1, max = 10, message = "size upto 10 Characters..")
	private String userFirstName;

	@Column
	@NotEmpty
	private String about;

	@Column
	@NotEmpty
	@Size(min = 1, max = 10, message = "size upto 10 Characters..")
	private String userMiddleName;

	@Column
	@NotEmpty
	@Size(min = 1, max = 10, message = "size upto 10 Characters..")
	private String userLastName;

	@NotNull(message = "is required")
	// @Temporal(TemporalType.DATE)
	@Column
	private String birthDate;

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
	@Pattern(regexp = "(^$|[0-9]{10})")
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

	/** Person has Experience */
	@OneToOne(mappedBy = "personalDetailsEntity")
	private ExperienceDetailsEntity experienceDetail;

	// person has multiple reference Details
	@OneToMany(mappedBy = "personalDetailsEntity")
	private List<ReferenceDetailsEntity> refernceDetailsEntity;
	
	
	@OneToOne(mappedBy = "personalDetailsEntity")
	private AchievementsAndHonoursEntity  AchievementsAndHonoursEntity;

	public List<ReferenceDetailsEntity> getRefernceDetailsEntity() {
		return refernceDetailsEntity;
	}

	public void setRefernceDetailsEntity(List<ReferenceDetailsEntity> refernceDetailsEntity) {
		this.refernceDetailsEntity = refernceDetailsEntity;
	}

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
	
	
	
	//Person has Experience
	@OneToOne(mappedBy = "personalDetailsEntity")
	private EducationalDetailsEntity educationalDetailsEntity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public EducationalDetailsEntity getEducationalDetailsEntity() {
		return educationalDetailsEntity;
	}

	public void setEducationalDetailsEntity(EducationalDetailsEntity educationalDetailsEntity) {
		this.educationalDetailsEntity = educationalDetailsEntity;
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

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
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

	@Override
	public String toString() {
		return "PersonalDetailsEntity [id=" + id + ", userFirstName=" + userFirstName + ", about=" + about
				+ ", userMiddleName=" + userMiddleName + ", userLastName=" + userLastName + ", birthDate=" + birthDate
				+ ", nationality=" + nationality + ", gender=" + gender + ", maritialStatus=" + maritialStatus
				+ ", emailId=" + emailId + ", linkedinId=" + linkedinId + ", skypeId=" + skypeId + ", phoneNo="
				+ phoneNo + ", currentAddress=" + currentAddress + ", city=" + city + ", country=" + country
				+ ", languageKnown=" + languageKnown + "]";
	}

}

/*
 * PersonalDetailsEntity personalDetailsEntity=new PersonalDetailsEntity
 * ("userFirstName","userMiddleName","userLastName","birthDate",
 * "nationality","gender","maritialStatus","emailId","linkedinId",
 * "skypeId","phoneNo","currentAddress","city","country","languageKnown");
 */