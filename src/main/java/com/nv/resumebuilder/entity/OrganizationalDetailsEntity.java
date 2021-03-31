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
@Table(name = "organizationaldetails")
public class OrganizationalDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "companyName")
	@NotEmpty(message = "organization name is required")
	@Size(min = 5, max = 40, message = "organization name must be less then 40")
	@Pattern(regexp = "^[a-zA-Z,() ]*$",message="nummbers are not  allowed")
	private String comName;

	@NotNull(message = "designation is required")
	@Pattern(regexp = "^[a-zA-Z,() ]*$",message="no special characters are allowed")
	@Column(name = "designation")
	private String designation;

	@NotEmpty(message = "Joining Date Required")
	@Column(name = "JoiningDate")
	private String date;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "personal_id")
	private PersonalDetailsEntity personalDetailsEntity;

	public OrganizationalDetailsEntity(String comName, String designation, String date) {
		super();
		this.comName = comName;
		this.designation = designation;
		this.date = date;
	}

}
