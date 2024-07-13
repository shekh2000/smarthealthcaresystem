package com.boot.smarthealthcaresystem.patientmanagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.boot.smarthealthcaresystem.patientmanagement.entities.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer>{

}
