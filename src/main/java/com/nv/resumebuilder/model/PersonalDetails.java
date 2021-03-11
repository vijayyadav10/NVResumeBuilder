package com.nv.resumebuilder.model;

import java.io.Serializable;

public class PersonalDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userFirstName;
	private String userMiddleName;
	private String userLastName;
	private String about;

	private String birthDate;

	private String nationality;
	private String gender;
	private String maritialStatus;

	private String emailId;
	private String linkedinId;
	private String skypeId;

	private String phoneNo;
	private String currentAddress;
	private String city;
	private String country;
	private String languageKnown;
	private String personalSkill;

	public PersonalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public PersonalDetails(String userFirstName, String userMiddleName, String userLastName, String about,
			String birthDate, String nationality, String gender, String maritialStatus, String emailId,
			String linkedinId, String skypeId, String phoneNo, String currentAddress, String city, String country,
			String languageKnown, String personalSkill) {
		super();
		this.userFirstName = userFirstName;
		this.userMiddleName = userMiddleName;
		this.userLastName = userLastName;
		this.about = about;
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
		this.personalSkill = personalSkill;
	}



	public String getPersonalSkill() {
		return personalSkill;
	}

	public void setPersonalSkill(String personalSkill) {
		this.personalSkill = personalSkill;
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

	public String getLanguageKnown() {
		return languageKnown;
	}

	public void setLanguageKnown(String languageKnown) {
		this.languageKnown = languageKnown;
	}



	@Override
	public String toString() {
		return "PersonalDetails [userFirstName=" + userFirstName + ", userMiddleName=" + userMiddleName
				+ ", userLastName=" + userLastName + ", about=" + about + ", birthDate=" + birthDate + ", nationality="
				+ nationality + ", gender=" + gender + ", maritialStatus=" + maritialStatus + ", emailId=" + emailId
				+ ", linkedinId=" + linkedinId + ", skypeId=" + skypeId + ", phoneNo=" + phoneNo + ", currentAddress="
				+ currentAddress + ", city=" + city + ", country=" + country + ", languageKnown=" + languageKnown
				+ ", personalSkill=" + personalSkill + "]";
	}



	public String getAbout() {
		return about;
	}



	public void setAbout(String about) {
		this.about = about;
	}

	
}
