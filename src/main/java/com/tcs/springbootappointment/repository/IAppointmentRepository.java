package com.tcs.springbootappointment.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.springbootappointment.Appointment;

public interface IAppointmentRepository extends CrudRepository<Appointment, Integer> {

}
