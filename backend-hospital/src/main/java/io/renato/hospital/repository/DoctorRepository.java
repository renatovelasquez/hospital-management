package io.renato.hospital.repository;

import io.renato.hospital.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findByBirthDate(Date date);

    List<Doctor> findByNameContainsOrLastNameContains(String name, String lastname);

}