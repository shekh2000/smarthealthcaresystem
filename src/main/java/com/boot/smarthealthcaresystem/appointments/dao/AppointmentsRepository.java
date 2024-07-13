package com.boot.smarthealthcaresystem.appointments.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.boot.smarthealthcaresystem.appointments.entities.Appointments;

public interface AppointmentsRepository extends CrudRepository<Appointments, Integer>{
	List<Appointments> findByPatientId(int patientId);
}
