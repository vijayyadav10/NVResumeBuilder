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
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "achievementsAndHonoursdetails")
public class AchievementsAndHonoursEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	@NotEmpty
	@Size(min = 1, max = 200, message = "Please enter at least one partication event....")
	@Pattern(regexp = "^[\\.a-zA-Z,0-9@*!() ]*$", message = "enter proper participation event name")
	@Column(name = "partication_event1")
	private String particationevent1;
	@NonNull
	@NotEmpty
	@Size(min = 1, max = 200, message = "Please enter at least one certification....")
	@Pattern(regexp = "^[\\.a-zA-Z,0-9@*!() ]*$", message = "enter proper certification  name")
	@Column(name = "certification1")
	private String certification1;
	@NonNull
	@NotEmpty
	@Size(min = 1, max = 200, message = "Please enter at least one awards and honoursdetails....")
	@Column(name = "awards_and_honoursdetails1")
	private String awardsandhonoursdetails1;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id")
	private PersonalDetailsEntity personalDetailsEntity;

}