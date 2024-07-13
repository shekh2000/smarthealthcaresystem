package com.boot.smarthealthcaresystem.appointments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.smarthealthcaresystem.appointments.dao.AppointmentsRepository;
import com.boot.smarthealthcaresystem.appointments.entities.Appointments;

@Service
public class AppointmentsService {
	@Autowired
	private AppointmentsRepository appointmentRepo;
	
	public List<Appointments> allAppointment(){
		return (List<Appointments>) appointmentRepo.findAll();
	}
	
	public List<Appointments> AppointmentById(int patientId){
		return appointmentRepo.findByPatientId(patientId);
	}
	
	public void addAppointment(Appointments appointment) {
		appointmentRepo.save(appointment);
		return;
	}
	
	public void updateAppointment(int Id,Appointments appointment) {
		appointmentRepo.save(appointment);
		return;
	}
	
	public void deleteAppointment(int id) {
		appointmentRepo.deleteById(id);
		return;
	}
}
