package io.renato.hospital.service;

import io.renato.hospital.entity.Patient;

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