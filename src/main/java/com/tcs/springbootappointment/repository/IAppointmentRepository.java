package com.tcs.springbootappointment.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.springbootappointment.entity.Appointment;

public interface IAppointmentRepository extends CrudRepository<Appointment, Integer> {

}
