package io.renato.hospital.patient.service;

import io.renato.hospital.patient.entity.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> listAllPatients();

    Patient getPatient(Long id);

    Patient createPatient(Patient patient);

    Patient updatePatient(Patient patient);

    void deletePatient(Long id);

//    List<Patient> findBySpeciality(Speciality speciality);

//    public Patient updateStock(Long id, Double quantity);
}