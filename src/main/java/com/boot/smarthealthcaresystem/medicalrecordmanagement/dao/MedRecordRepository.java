package com.boot.smarthealthcaresystem.medicalrecordmanagement.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.boot.smarthealthcaresystem.medicalrecordmanagement.entities.MedicalRecord;

public interface MedRecordRepository extends CrudRepository<MedicalRecord, Integer>{
	List<MedicalRecord> findByPatientId(int patientId);
}
