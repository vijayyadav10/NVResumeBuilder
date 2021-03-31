package com.nv.resumebuilder.entity;

import java.io.Serializable;
import java.util.List;

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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "personaldetails")
public class PersonalDetailsEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull(message = "is required")
	@Size(min = 2, max = 15, message = "size upto 15 Characters..")
	@Pattern(regexp ="^[a-zA-Z  ]+$",message="numbers are not allowed ")
	private String userFirstName;
	
	@NotNull(message = "is required")
	@Pattern(regexp ="^[a-zA-Z  ]+$",message="numbers are not allowed ")
	@Size(min = 2, max = 15, message = "size upto 15 Characters..")
	private String userMiddleName;
	
	@NotNull(message = "is required")
	@Pattern(regexp ="^[a-zA-Z  ]+$",message="numbers are not allowed ")
	@Size(min = 2, max = 15, message = "size upto 15 Characters..")
	private String userLastName;
	
	@NotNull(message = "is required")
	@Pattern(regexp ="^[a-zA-Z  .,]+$",message="numbers are not allowed ")
	private String about;

	@NotNull(message = "is required")
	// @Temporal(TemporalType.DATE)
	private String birthDate;

	@NotNull(message = "is required")
	@Size(min = 3, max = 15, message = "enter upto 15 Characters..")
	@Pattern(regexp ="^[a-zA-Z  ]+$",message="numbers are not allowed ")
	private String nationality;

	@NotNull(message = "Select gender")
	private String gender;
	
	@NotEmpty(message = "Select your Maritial Status")
	private String maritialStatus;

	@NotNull(message = "is required")
	@Email(message = "Invalid email! Please enter valid email")
	private String emailId;

	@NotNull(message = "is required")
	@Pattern(regexp="((http(s?)://)*([a-zA-Z0-9\\-])*\\.|[linkedin])[linkedin/in/~\\-]+\\.[a-zA-Z0-9/~\\-_,&=\\?\\.;]+[^\\.,\\s<]", message = "enter valid linkedin profile")
	private String linkedinId;

	@NotNull(message = "is required")
	@Pattern(regexp ="^[live].(.+)$",message="enter valid skype id ")
	private String skypeId;

	@NotNull(message = "is required")
	@Pattern(regexp = "^[7-9][0-9]{9}$", message = "enter valid phone no")
	private String phoneNo;

	@NotNull(message = "is required")
	@Size(min = 6, max = 100, message = "enter upto 100 Characters..")
	private String currentAddress;

	@NotNull(message = "is required")
	@Pattern(regexp ="^[a-zA-Z]+$",message="numbers are not allowed ")
	@Size(min = 3, max = 15, message = "enter upto 15 Characters..")
	private String city;

	@NotNull(message = "is required")
	@Pattern(regexp ="^[a-zA-Z ]+$",message="numbers are not allowed ")
	@Size(min = 5, max = 20, message = "enter upto 20 Characters..")
	private String country;

	@NotEmpty(message = "Enter at least one language.")
	@Size(min = 10, max = 100, message = "enter upto 100 Characters..")
	private String languageKnown;

	// Person has Education
	@OneToOne(mappedBy = "personalDetailsEntity")
	private EducationalDetailsEntity educationalDetailsEntity;
	/* Person has Experience */
	@OneToOne(mappedBy = "personalDetailsEntity")
	private ExperienceDetailsEntity experienceDetail;

	// person has multiple reference Details
	@OneToMany(mappedBy = "personalDetailsEntity")
	private List<ReferenceDetailsEntity> refernceDetailsEntity;

	@OneToOne(mappedBy = "personalDetailsEntity")
	private AchievementsAndHonoursEntity AchievementsAndHonoursEntity;

	@OneToOne(mappedBy = "personalDetailsEntity")
	private OrganizationalDetailsEntity organizationalDetailsEntity;

}
