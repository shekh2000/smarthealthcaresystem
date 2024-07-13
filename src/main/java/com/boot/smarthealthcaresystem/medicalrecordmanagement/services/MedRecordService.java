package com.boot.smarthealthcaresystem.medicalrecordmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.smarthealthcaresystem.medicalrecordmanagement.dao.MedRecordRepository;
import com.boot.smarthealthcaresystem.medicalrecordmanagement.entities.MedicalRecord;

@Service
public class MedRecordService {
	@Autowired
	private MedRecordRepository medRecordRepo;
	
	public List<MedicalRecord> getAllRecord(){
		return (List<MedicalRecord>)medRecordRepo.findAll();
	}
	
	public List<MedicalRecord> getRecordById(int patientId) {
		return medRecordRepo.findByPatientId(patientId);
	}
	
	public void addMedRecord(MedicalRecord medRecord) {
		medRecordRepo.save(medRecord);
		return;
	}
	
	public void updateRecord(int Id,MedicalRecord medRecord) {
		medRecordRepo.save(medRecord);
		return;
	}
	
	public void deleteRecord(int Id) {
		medRecordRepo.deleteById(Id);
	}
}
