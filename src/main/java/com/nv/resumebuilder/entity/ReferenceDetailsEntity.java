package com.nv.resumebuilder.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ReferenceDetailsEntity implements Serializable {
	
	private static final long serialVersionUID = 5581597786026830472L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @NonNull
	@NotEmpty
	@Size(min = 10, max = 30)
	private String refernceName;
    
    @NonNull
	@NotEmpty
	@Size(min = 2, max = 20, message = "Enter designation upto 20 characters!!")
	private String designation;
    
    @NonNull
	@NotEmpty
	@Email(message = "Please enter valid email")
	private String emailId;
    
    @NonNull
	@Pattern(regexp = "^[7-9][0-9]{9}$")
	private String contactNo;
    
    @NonNull
	@NotEmpty
	@Size(min = 10, max = 100, message = "Enter upto 100 characters")
	private String address;
    
    @NonNull
	@NotEmpty
	@Size(max = 40, message = "Enter upto 40 characters")
	private String organization;
   
	@ManyToOne
	@JoinColumn(name="personaldetails_id")
	private PersonalDetailsEntity personalDetailsEntity;

	
//<!--A shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields, @Setter on all non-final fields,
//and @RequiredArgsConstructor--->
}
