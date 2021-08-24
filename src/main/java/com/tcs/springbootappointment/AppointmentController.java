package com.tcs.springbootappointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {
	@Autowired
	IAppointmentService appointmentService;
	@GetMapping("/getappointment")
	private String getAppointment() {
		System.out.println("called");
		return "hello";
	}
	
	@PostMapping("/appointment")
	private void saveAppointment(@RequestBody Appointment appointment) {
		appointmentService.save(appointment);
		System.out.println(appointment.getName());
		System.out.println(appointment.getAmount());
		System.out.println(appointment.getPhoneNumber());

	}
}
