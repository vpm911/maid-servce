package com.maid.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Email(message = "Email is invalid")
	@NotEmpty
	private String email;

	@Size(min = 2, max = 25, message = "firstName should be between 2 to 25 chars long")
	@NotEmpty
	private String firstName;

	@Size(min = 2, max = 25, message = "firstName should be between 2 to 25 chars long")
	private String lastName;

	@Size(min = 8, max = 10, message="not a valid phone number")
	@NotNull
	private String phoneNumber;
	
	private String passwordHash;
	
	private String address;
}
