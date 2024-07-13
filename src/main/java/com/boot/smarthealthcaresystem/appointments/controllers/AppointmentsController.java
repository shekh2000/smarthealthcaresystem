package com.boot.smarthealthcaresystem.appointments.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.smarthealthcaresystem.appointments.entities.Appointments;
import com.boot.smarthealthcaresystem.appointments.service.AppointmentsService;

@RestController
public class AppointmentsController {
	@Autowired
	private AppointmentsService appointmentsService;
	
	@GetMapping("/appointments")
	public List<Appointments> allAppointment(){
		return appointmentsService.allAppointment();
	}
	
	@GetMapping("/appointments/{patientId}")
	public List<Appointments> AppointmentById(@PathVariable("patientId") int patientId){
		return appointmentsService.AppointmentById(patientId);
	}
	
	@PostMapping("/appointments")
	public String addAppointment(@RequestBody Appointments appointment) {
		appointmentsService.addAppointment(appointment);
		return "added";
	}
	
	@PutMapping("appointments/{id}")
	public String updateAppointment(@PathVariable("id") int Id,@RequestBody Appointments appointment) {
		appointmentsService.updateAppointment(Id,appointment);
		return "updated";
	}
	
	@DeleteMapping("appointments/{id}")
	public String deleteAppointment(@PathVariable("id") int id) {
		appointmentsService.deleteAppointment(id);
		return "deleted";
	}
}








