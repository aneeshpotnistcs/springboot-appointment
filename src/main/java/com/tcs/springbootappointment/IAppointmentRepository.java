package com.tcs.springbootappointment;

import org.springframework.data.repository.CrudRepository;

public interface IAppointmentRepository extends CrudRepository<Appointment, Integer>{

}
