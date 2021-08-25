package com.tcs.springbootappointment.service;

import java.util.Optional;

import com.tcs.springbootappointment.Appointment;

public interface IAppointmentService {
	void save(Appointment appointment);

	Iterable<Appointment> getAllAppointments();

	Optional<Appointment> getAppointment(Integer id);

	Optional<Appointment> deleteAppointment(Integer id);

	void update(Appointment appointment, Integer id);
}
