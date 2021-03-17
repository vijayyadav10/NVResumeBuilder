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
import javax.validation.constraints.Size;

@Entity

public class AchievementsAndHonoursEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Size(min = 1, max = 200, message = "Please enter at least one partication event....")
	@Column(name = "partication_event1")
	private String particationevent1;

	@NotEmpty
	@Size(min = 1, max = 200, message = "Please enter at least one certification....")
	@Column(name = "certification1")
	private String certification1;

	@NotEmpty
	@Size(min = 1, max = 200, message = "Please enter at least one awards and honoursdetails....")
	@Column(name = "awards_and_honoursdetails1")
	private String awardsandhonoursdetails1;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id")
	private PersonalDetailsEntity personalDetailsEntity;

	public PersonalDetailsEntity getPersonalDetailsEntity() {
		return personalDetailsEntity;
	}

	public void setPersonalDetailsEntity(PersonalDetailsEntity personalDetailsEntity) {
		this.personalDetailsEntity = personalDetailsEntity;
	}

	public AchievementsAndHonoursEntity() {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((awardsandhonoursdetails1 == null) ? 0 : awardsandhonoursdetails1.hashCode());
		result = prime * result + ((certification1 == null) ? 0 : certification1.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((particationevent1 == null) ? 0 : particationevent1.hashCode());
		result = prime * result + ((personalDetailsEntity == null) ? 0 : personalDetailsEntity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AchievementsAndHonoursEntity other = (AchievementsAndHonoursEntity) obj;
		if (awardsandhonoursdetails1 == null) {
			if (other.awardsandhonoursdetails1 != null)
				return false;
		} else if (!awardsandhonoursdetails1.equals(other.awardsandhonoursdetails1))
			return false;
		if (certification1 == null) {
			if (other.certification1 != null)
				return false;
		} else if (!certification1.equals(other.certification1))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (particationevent1 == null) {
			if (other.particationevent1 != null)
				return false;
		} else if (!particationevent1.equals(other.particationevent1))
			return false;
		if (personalDetailsEntity == null) {
			if (other.personalDetailsEntity != null)
				return false;
		} else if (!personalDetailsEntity.equals(other.personalDetailsEntity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AchievementsAndHonoursEntity [id=" + id + ", particationevent1=" + particationevent1
				+ ", certification1=" + certification1 + ", awardsandhonoursdetails1=" + awardsandhonoursdetails1
				+ ", personalDetailsEntity=" + personalDetailsEntity + "]";
	}

}