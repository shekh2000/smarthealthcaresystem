package com.boot.smarthealthcaresystem.medicalrecordmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.smarthealthcaresystem.medicalrecordmanagement.entities.MedicalRecord;
import com.boot.smarthealthcaresystem.medicalrecordmanagement.services.MedRecordService;

@RestController
public class MedicalRecordController {
	@Autowired
	private MedRecordService medRecordService;
	
	@GetMapping("/medicalRecords")
	public List<MedicalRecord> getAllRecord(){
		return (List<MedicalRecord>)medRecordService.getAllRecord();
	}
	
	@GetMapping("/medicalRecords/{patientId}")
	public List<MedicalRecord> getRecordById(@PathVariable("patientId") int patientId) {
		return medRecordService.getRecordById(patientId);
	}
	
	@PostMapping("/medicalRecords")
	public String addMedRecord(@RequestBody MedicalRecord medRecord) {
		medRecordService.addMedRecord(medRecord);
		return "added";
	}
	
	@PutMapping("/medicalRecords/{id}")
	public String updateRecord(@PathVariable("id") int Id,@RequestBody MedicalRecord medRecord) {
		medRecordService.updateRecord(Id,medRecord);
		return "updated";
	}
	
	@DeleteMapping("/medicalRecords/{id}")
	public String deleteRecord(@PathVariable("id") int Id) {
		medRecordService.deleteRecord(Id);
		return "deleted";
	}
}
