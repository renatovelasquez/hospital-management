package io.renato.hospital.patient.repository;

import io.renato.hospital.patient.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    List<Patient> findByBirthDate(Date date);

    List<Patient> findByNameContains(String name);

    List<Patient> findByLastNameContains(String lastName);

}