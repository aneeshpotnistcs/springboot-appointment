package com.tcs.springbootappointment.service;

import java.util.Optional;

import com.tcs.springbootappointment.entity.Appointment;

public interface IAppointmentService {
	void save(Appointment appointment, Integer id);

	Iterable<Appointment> getAllAppointments();

	Optional<Appointment> getAppointment(Integer id);

	Optional<Appointment> deleteAppointment(Integer id);

	void update(Appointment appointment, Integer id);
}
