package com.boot.smarthealthcaresystem.patientmanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.smarthealthcaresystem.patientmanagement.dao.PatientRepository;
import com.boot.smarthealthcaresystem.patientmanagement.entities.Patient;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepo;
	public List<Patient> allPatient(){
		return (List<Patient>) patientRepo.findAll();
	}
	
	public Optional<Patient> patientById(Integer Id) {
		return patientRepo.findById(Id);
	}
	
	public void addPatient(Patient patient) {
		patientRepo.save(patient);
		return ;
	}
	
	public void updatePatient(int id,Patient patient) {
		patientRepo.save(patient);
		return;
	}
	
	public void deletePatient(int id) {
		patientRepo.deleteById(id);
		return;
	}
}
