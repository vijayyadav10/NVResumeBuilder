package com.nv.resumebuilder.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class EducationalDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 5, max = 50, message = "please enter full college name")
	@Column(name = "nameOfCollege")
	private String nameOfCollege;

	@NotEmpty(message = "is required")
	@Column(name = "degree")
	private String degree;

	@NotEmpty(message = " is required")
	@Column(name = "university")
	private String university;

	@NotEmpty(message = "is required")
	@Column(name = "yearOfPassing")
	private String yearOfPassing;

	@NotEmpty(message = "is required")
	@Column(name = "percentage")
	private String percentage;

	@Column(name = "Masters_degree")
	private String degreeM;

	@Column(name = "Masters_college_name")
	private String collegeNameM;

	@Column(name = "Masters_university")
	private String universityM;

	@Column(name = "Masters_yearOfPassing")
	private String yearOfPassingM;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PersonalDetailsEntity getPersonalDetailsEntity() {
		return personalDetailsEntity;
	}

	public void setPersonalDetailsEntity(PersonalDetailsEntity personalDetailsEntity) {
		this.personalDetailsEntity = personalDetailsEntity;
	}

	@Column(name = "technicalSkills")
	private String technicalSkills;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "personalDetailsEntity_id")
	private PersonalDetailsEntity personalDetailsEntity;

	public EducationalDetailsEntity() {

	}

	public EducationalDetailsEntity(String nameOfCollege, String degree, String university, String yearOfPassing,
			String percentage, String degreeM, String collegeNameM, String universityM, String yearOfPassingM,
			String technicalSkills) {
		super();

		this.nameOfCollege = nameOfCollege;
		this.degree = degree;
		this.university = university;
		this.yearOfPassing = yearOfPassing;
		this.percentage = percentage;
		this.degreeM = degreeM;
		this.collegeNameM = collegeNameM;
		this.universityM = universityM;
		this.yearOfPassingM = yearOfPassingM;
		this.technicalSkills = technicalSkills;
	}

	public String getNameOfCollege() {
		return nameOfCollege;
	}

	public void setNameOfCollege(String nameOfCollege) {
		this.nameOfCollege = nameOfCollege;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getDegreeM() {
		return degreeM;
	}

	public void setDegreeM(String degreeM) {
		this.degreeM = degreeM;
	}

	public String getCollegeNameM() {
		return collegeNameM;
	}

	public void setCollegeNameM(String collegeNameM) {
		this.collegeNameM = collegeNameM;
	}

	public String getUniversityM() {
		return universityM;
	}

	public void setUniversityM(String universityM) {
		this.universityM = universityM;
	}

	public String getYearOfPassingM() {
		return yearOfPassingM;
	}

	public void setYearOfPassingM(String yearOfPassingM) {
		this.yearOfPassingM = yearOfPassingM;
	}

	public String getTechnicalSkills() {
		return technicalSkills;
	}

	public void setTechnicalSkills(String technicalSkills) {
		this.technicalSkills = technicalSkills;
	}

	@Override
	public String toString() {
		return "EducationalDetailsEntity [nameOfCollege=" + nameOfCollege + ", degree=" + degree + ", university="
				+ university + ", yearOfPassing=" + yearOfPassing + ", percentage=" + percentage + ", degreeM="
				+ degreeM + ", collegeNameM=" + collegeNameM + ", universityM=" + universityM + ", yearOfPassingM="
				+ yearOfPassingM + ", technicalSkills=" + technicalSkills + "]";
	}

}
