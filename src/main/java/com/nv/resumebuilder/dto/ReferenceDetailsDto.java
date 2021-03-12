package com.nv.resumebuilder.dto;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.nv.resumebuilder.entity.PersonalDetailsEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReferenceDetailsDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Size(min = 10, max = 30)
	private String refernceName;

	@NotEmpty
	@Size(min = 2, max = 20, message = "Enter designation upto 20 characters!!")
	private String designation;

	@NotEmpty
	@Email(message = "Please enter valid email")
	private String emailId;

	@Pattern(regexp = "^[7-9][0-9]{9}$")
	private String contactNo;

	@NotEmpty
	@Size(min = 10, max = 100, message = "Enter upto 100 characters")
	private String address;

	@NotEmpty
	@Size(max = 40, message = "Enter upto 40 characters")
	private String organization;

	@ManyToOne
	@JoinColumn(name="personaldetails_id")
	private PersonalDetailsEntity personalDetailsEntity;
}
