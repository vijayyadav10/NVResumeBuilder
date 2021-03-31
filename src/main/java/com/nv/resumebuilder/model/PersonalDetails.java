package com.nv.resumebuilder.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
