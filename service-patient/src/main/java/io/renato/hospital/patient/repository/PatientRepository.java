package io.renato.hospital.patient.repository;

import io.renato.hospital.patient.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

//    List<Doctor> findBySpeciality(Speciality speciality);
}