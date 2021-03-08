package com.nv.resumebuilder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "achievementsandhonour")
public class AchievementsAndHonoursEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotEmpty
	@Size(min = 1, max = 200, message = "Please enter at least one partication event....")
	@Column(name = "partication_event1")
	private String particationevent1;

	@ColumnDefault("'null'")
	@Column(name = "partication_event2", nullable = true)
	private String particationevent2;

	@Column(name = "partication_event3")
	private String particationevent3;

	@Column(name = "partication_event4")
	private String particationevent4;

	@Column(name = "partication_event5")
	private String particationevent5;

	@NotEmpty
	@Size(min = 1, max = 200, message = "Please enter at least one certification....")
	@Column(name = "certification1")
	private String certification1;

	@Column(name = "certification2")
	private String certification2;

	@Column(name = "certification3")
	private String certification3;

	@Column(name = "certification4")
	private String certification4;

	@Column(name = "certification5")
	private String certification5;

	@NotEmpty
	@Size(min = 1, max = 200, message = "Please enter at least one awards and honoursdetails....")
	@Column(name = "awards_and_honoursdetails1")
	private String awardsandhonoursdetails1;

	@Column(name = "awards_and_honoursdetails2")
	private String awardsandhonoursdetails2;

	@Column(name = "awards_and_honoursdetails3")
	private String awardsandhonoursdetails3;

	@Column(name = "awards_and_honoursdetails4")
	private String awardsandhonoursdetails4;

	@Column(name = "awards_and_honoursdetails5")
	private String awardsandhonoursdetails5;

	public AchievementsAndHonoursEntity() {

	}

	public AchievementsAndHonoursEntity(String particationevent1, String particationevent2, String particationevent3,
			String particationevent4, String particationevent5, String certification1, String certification2,
			String certification3, String certification4, String certification5, String awardsandhonoursdetails1,
			String awardsandhonoursdetails2, String awardsandhonoursdetails3, String awardsandhonoursdetails4,
			String awardsandhonoursdetails5) {
		super();
		this.particationevent1 = particationevent1;
		this.particationevent2 = particationevent2;
		this.particationevent3 = particationevent3;
		this.particationevent4 = particationevent4;
		this.particationevent5 = particationevent5;
		this.certification1 = certification1;
		this.certification2 = certification2;
		this.certification3 = certification3;
		this.certification4 = certification4;
		this.certification5 = certification5;
		this.awardsandhonoursdetails1 = awardsandhonoursdetails1;
		this.awardsandhonoursdetails2 = awardsandhonoursdetails2;
		this.awardsandhonoursdetails3 = awardsandhonoursdetails3;
		this.awardsandhonoursdetails4 = awardsandhonoursdetails4;
		this.awardsandhonoursdetails5 = awardsandhonoursdetails5;
	}

	public String getParticationevent1() {
		return particationevent1;
	}

	public void setParticationevent1(String particationevent1) {
		this.particationevent1 = particationevent1;
	}

	public String getParticationevent2() {
		return particationevent2;
	}

	public void setParticationevent2(String particationevent2) {
		this.particationevent2 = particationevent2;
	}

	public String getParticationevent3() {
		return particationevent3;
	}

	public void setParticationevent3(String particationevent3) {
		this.particationevent3 = particationevent3;
	}

	public String getParticationevent4() {
		return particationevent4;
	}

	public void setParticationevent4(String particationevent4) {
		this.particationevent4 = particationevent4;
	}

	public String getParticationevent5() {
		return particationevent5;
	}

	public void setParticationevent5(String particationevent5) {
		this.particationevent5 = particationevent5;
	}

	public String getCertification1() {
		return certification1;
	}

	public void setCertification1(String certification1) {
		this.certification1 = certification1;
	}

	public String getCertification2() {
		return certification2;
	}

	public void setCertification2(String certification2) {
		this.certification2 = certification2;
	}

	public String getCertification3() {
		return certification3;
	}

	public void setCertification3(String certification3) {
		this.certification3 = certification3;
	}

	public String getCertification4() {
		return certification4;
	}

	public void setCertification4(String certification4) {
		this.certification4 = certification4;
	}

	public String getCertification5() {
		return certification5;
	}

	public void setCertification5(String certification5) {
		this.certification5 = certification5;
	}

	public String getAwardsandhonoursdetails1() {
		return awardsandhonoursdetails1;
	}

	public void setAwardsandhonoursdetails1(String awardsandhonoursdetails1) {
		this.awardsandhonoursdetails1 = awardsandhonoursdetails1;
	}

	public String getAwardsandhonoursdetails2() {
		return awardsandhonoursdetails2;
	}

	public void setAwardsandhonoursdetails2(String awardsandhonoursdetails2) {
		this.awardsandhonoursdetails2 = awardsandhonoursdetails2;
	}

	public String getAwardsandhonoursdetails3() {
		return awardsandhonoursdetails3;
	}

	public void setAwardsandhonoursdetails3(String awardsandhonoursdetails3) {
		this.awardsandhonoursdetails3 = awardsandhonoursdetails3;
	}

	public String getAwardsandhonoursdetails4() {
		return awardsandhonoursdetails4;
	}

	public void setAwardsandhonoursdetails4(String awardsandhonoursdetails4) {
		this.awardsandhonoursdetails4 = awardsandhonoursdetails4;
	}

	public String getAwardsandhonoursdetails5() {
		return awardsandhonoursdetails5;
	}

	public void setAwardsandhonoursdetails5(String awardsandhonoursdetails5) {
		this.awardsandhonoursdetails5 = awardsandhonoursdetails5;
	}

	@Override
	public String toString() {
		return "AchievementsAndHonours [particationevent1=" + particationevent1 + ", particationevent2="
				+ particationevent2 + ", particationevent3=" + particationevent3 + ", particationevent4="
				+ particationevent4 + ", particationevent5=" + particationevent5 + ", certification1=" + certification1
				+ ", certification2=" + certification2 + ", certification3=" + certification3 + ", certification4="
				+ certification4 + ", certification5=" + certification5 + ", awardsandhonoursdetails1="
				+ awardsandhonoursdetails1 + ", awardsandhonoursdetails2=" + awardsandhonoursdetails2
				+ ", awardsandhonoursdetails3=" + awardsandhonoursdetails3 + ", awardsandhonoursdetails4="
				+ awardsandhonoursdetails4 + ", awardsandhonoursdetails5=" + awardsandhonoursdetails5 + "]";
	}

}
