package io.renato.hospital.patient.repository;

import io.renato.hospital.patient.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findByBirthDate(Date date);

    List<Doctor> findByNameContains(String name);

    List<Doctor> findByLastNameContains(String lastName);

}