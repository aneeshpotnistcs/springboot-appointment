package com.tcs.springbootappointment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Appointment {
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
	private byte age;
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

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

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
