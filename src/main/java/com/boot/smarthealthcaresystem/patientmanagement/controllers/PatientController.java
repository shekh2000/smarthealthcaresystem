package com.boot.smarthealthcaresystem.patientmanagement.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.smarthealthcaresystem.patientmanagement.entities.Patient;
import com.boot.smarthealthcaresystem.patientmanagement.services.PatientService;

@RestController
public class PatientController {
	@Autowired
	public PatientService patientService;
	
	@GetMapping("/patients")
	private List<Patient> allPatient() {
		return patientService.allPatient();
	}
	
	@GetMapping("/patients/{id}")
	public Optional<Patient> patientById(@PathVariable("id") int Id) {
		return patientService.patientById(Id);
	}
	
	@PostMapping("/patients")
	public String addPatient(@RequestBody Patient patient) {
		System.out.println(patient.getName());
		patientService.addPatient(patient);
		return "added";
	}
	
	@PutMapping("/patients/{id}")
	public String updatePatient(@PathVariable("id") int Id,@RequestBody Patient patient) {
		patientService.updatePatient(Id, patient);
		return "updated";
	}
	
	@DeleteMapping("/patients/{id}")
	public String deletePatient(@PathVariable("id") int Id) {
		patientService.deletePatient(Id);
		return "deleted";
	}
}
