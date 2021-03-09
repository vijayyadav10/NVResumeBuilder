package com.nv.resumebuilder.model;

public class EducationalDetails {

	private String nameOfCollege;
	private String degree;
	private String university;
	private String yearOfPassing;
	private String degreeM;
	private String percentage;
	private String collegeNameM;
	private String universityM;
	private String yearOfPassingM;
	private String technicalSkills;

	public EducationalDetails(String nameOfCollege, String degree, String university, String yearOfPassing,
			String percentage, String degreeM, String collegeNameM, String universityM, String yearOfPassingM,
			String technicalSkills) {

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

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
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
		return "EducationalDetails [nameOfCollege=" + nameOfCollege + ", degree=" + degree + ", university="
				+ university + ", yearOfPassing=" + yearOfPassing + ", degreeM=" + degreeM + ", percentage="
				+ percentage + ", collegeNameM=" + collegeNameM + ", universityM=" + universityM + ", yearOfPassingM="
				+ yearOfPassingM + ", technicalSkills=" + technicalSkills + "]";
	}

}
