package com.tcs.springbootappointment.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.springbootappointment.entity.Appointment;
import com.tcs.springbootappointment.exception.AppointmentNotFoundException;
import com.tcs.springbootappointment.service.IAppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	private static final Logger logger = LoggerFactory.getLogger(AppointmentController.class);

	@Autowired
	IAppointmentService appointmentService;

	@GetMapping
	public Iterable<Appointment> getAppointment() {
		return appointmentService.getAllAppointments();
	}

	@GetMapping("/{id}")
	public Optional<Appointment> getAppointment(@PathVariable("id") Integer id) {
		return appointmentService.getAppointment(id);
	}

	@ExceptionHandler(value = { AppointmentNotFoundException.class, IllegalStateException.class,
			EmptyResultDataAccessException.class })
	public ResponseEntity<Appointment> exception(Exception appointmentNotFoundException) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PostMapping("/{id}")
	public void saveAppointment(@PathVariable("id") Integer id,@RequestBody @Valid Appointment appointment) {
		appointmentService.save(appointment,id);
	}

	@DeleteMapping("/{id}")
	public Optional<Appointment> deleteAppointment(@PathVariable("id") Integer id) {
		return appointmentService.deleteAppointment(id);
	}
	
	@PutMapping("/{id}")
	public void updateAppointment(@PathVariable("id") Integer id,@RequestBody Appointment appointment) {
		appointmentService.update(appointment, id);
	}

}
