package com.tcs.springbootappointment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer appointmentId;
	private String name;
	private Long phoneNumber;
	private String email;
	private byte age;
	private String address;
	private String trainerPreference;
	private String physioRequired;
	private String packageSelected;
	private float amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTrainerPreference() {
		return trainerPreference;
	}
	public void setTrainerPreference(String trainerPreference) {
		this.trainerPreference = trainerPreference;
	}
	public String getPhysioRequired() {
		return physioRequired;
	}
	public void setPhysioRequired(String physioRequired) {
		this.physioRequired = physioRequired;
	}
	public String getPackageSelected() {
		return packageSelected;
	}
	public void setPackageSelected(String packageSelected) {
		this.packageSelected = packageSelected;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
}
