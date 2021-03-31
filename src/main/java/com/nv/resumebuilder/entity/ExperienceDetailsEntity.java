package com.nv.resumebuilder.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nv.resumebuilder.validation.PastDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "experiencedetails")
public class ExperienceDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long experienceId;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	@Column(name = "company_name")
	private String companyName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	@Column(name = "designation")
	private String designation;

	@PastDate
	@Column(name = "joining_date")
	private Date joiningDate;

	@Column(name = "leaving_date")
	private Date leavingDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private PersonalDetailsEntity personalDetailsEntity;

	@JsonIgnore
	@OneToMany(mappedBy = "experienceDetail", cascade = CascadeType.ALL)
	private List<ProjectDetailsEntity> project;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((experienceId == null) ? 0 : experienceId.hashCode());
		result = prime * result + ((joiningDate == null) ? 0 : joiningDate.hashCode());
		result = prime * result + ((leavingDate == null) ? 0 : leavingDate.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
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
		ExperienceDetailsEntity other = (ExperienceDetailsEntity) obj;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (experienceId == null) {
			if (other.experienceId != null)
				return false;
		} else if (!experienceId.equals(other.experienceId))
			return false;
		if (joiningDate == null) {
			if (other.joiningDate != null)
				return false;
		} else if (!joiningDate.equals(other.joiningDate))
			return false;
		if (leavingDate == null) {
			if (other.leavingDate != null)
				return false;
		} else if (!leavingDate.equals(other.leavingDate))
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		return true;
	}

	
}