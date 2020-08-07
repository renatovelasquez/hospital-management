package io.renato.hospital.service;

import io.renato.hospital.entity.Patient;

import java.util.Date;
import java.util.List;

public interface PatientService {
    List<Patient> listAllPatients();

    Patient getPatient(Long id);

    Patient createPatient(Patient patient);

    Patient updatePatient(Patient patient);

    void deletePatient(Long id);

    List<Patient> findByNameOrLastname(String name, String lastname);

    List<Patient> findByBirth(Date date);
}