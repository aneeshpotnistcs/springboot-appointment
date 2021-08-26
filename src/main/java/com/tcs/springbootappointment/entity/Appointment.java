package com.tcs.springbootappointment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Appointment")
public class Appointment{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer appointmentId;
	@NotBlank(message = "Name is mandatory and should have atleast 3 characters")
	@Size(min = 3)
	private String name;
	@NotNull(message = "Phone number is mandatory")
	private Long phoneNumber;
	@NotBlank(message = "Email is mandatory")
	@Email(message = "Proper email format required")
	private String email;
	@NotNull(message = "Age is mandatory")
	@Min(18)
	@Max(60)
	private int age;
	@NotBlank(message = "Address is mandatory")
	private String address;
	@NotBlank(message = "Trainer Preference is mandatory")
	private String trainerPreference;
	@NotBlank(message = "Physiotherapist required field is mandatory")
	private String physioRequired;
	@NotBlank(message = "Selected Package is mandatory")
	private String packageSelected;
	@NotNull(message = "Amount is mandatory")
	private float amount;
		
	@ManyToOne
	@JsonIgnore
	private User user;
	
}
