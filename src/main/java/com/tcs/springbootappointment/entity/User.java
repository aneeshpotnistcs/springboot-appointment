package com.tcs.springbootappointment.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer ID;

	private String firstName;

	private String lastName;
	private int age;
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private Set<Appointment> appointments;
}
