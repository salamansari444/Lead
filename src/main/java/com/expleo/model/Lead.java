package com.expleo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "lead_tb1")
public class Lead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer leadId;
	
	@Column(nullable = false)
	@Pattern(regexp = "^[A-Za-z]+$")
	private String firstName;
	
	@Column(nullable = false)
	@Pattern(regexp = "^[A-Za-z]+$")
	private String middleName;
	
	
	
	@Column(nullable = false)
	@Pattern(regexp = "^[A-Za-z]+$")
	private String lastName;
	
	@Column(nullable = false)
	@Pattern(regexp = "^[6-9]\\d{9}$")
	private String mobileNumber;
	
	@Pattern(regexp = "^(Male|Female|Others)")
	private String gender;
	
	@Column(nullable = false)
    @JsonFormat(pattern = "yyyy/MM/dd")
	private Date dateOfBirth;
	
	@Column(nullable = false)
	@Email
	private String email;
	
	
}
