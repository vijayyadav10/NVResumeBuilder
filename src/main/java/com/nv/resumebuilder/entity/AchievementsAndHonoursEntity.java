package com.nv.resumebuilder.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



@Entity
@Table(name="achievementsandhonour")
public class AchievementsAndHonoursEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@NotEmpty  
	@Size(min=1,max=200,message="Please enter at least one partication event....")
	@Column(name="partication_event1")
	private String particationevent1; 


	@NotEmpty
	@Size(min=1,max=200,message="Please enter at least one certification....")
	@Column(name="certification1")
	private String certification1;

	@NotEmpty
	@Size(min=1,max=200,message="Please enter at least one awards and honoursdetails....")
	@Column(name="awards_and_honoursdetails1")
	private String awardsandhonoursdetails1; 


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private PersonalDetailsEntity personalDetailsEntity;

	public AchievementsAndHonoursEntity() 
	{

	}

	public AchievementsAndHonoursEntity(Long id,
			@NotEmpty @Size(min = 1, max = 200, message = "Please enter at least one partication event....") String particationevent1,
			@NotEmpty @Size(min = 1, max = 200, message = "Please enter at least one certification....") String certification1,
			@NotEmpty @Size(min = 1, max = 200, message = "Please enter at least one awards and honoursdetails....") String awardsandhonoursdetails1,
			PersonalDetailsEntity personalDetailsEntity) {
		super();
		this.id = id;
		this.particationevent1 = particationevent1;
		this.certification1 = certification1;
		this.awardsandhonoursdetails1 = awardsandhonoursdetails1;
		this.personalDetailsEntity = personalDetailsEntity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getParticationevent1() {
		return particationevent1;
	}

	public void setParticationevent1(String particationevent1) {
		this.particationevent1 = particationevent1;
	}

	public String getCertification1() {
		return certification1;
	}

	public void setCertification1(String certification1) {
		this.certification1 = certification1;
	}

	public String getAwardsandhonoursdetails1() {
		return awardsandhonoursdetails1;
	}

	public void setAwardsandhonoursdetails1(String awardsandhonoursdetails1) {
		this.awardsandhonoursdetails1 = awardsandhonoursdetails1;
	}

	public PersonalDetailsEntity getPersonalDetailsEntity() {
		return personalDetailsEntity;
	}

	public void setPersonalDetailsEntity(PersonalDetailsEntity personalDetailsEntity) {
		this.personalDetailsEntity = personalDetailsEntity;
	}
}
