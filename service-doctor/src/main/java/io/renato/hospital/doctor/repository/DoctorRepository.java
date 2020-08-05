package io.renato.hospital.doctor.repository;

import io.renato.hospital.doctor.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

//    List<Doctor> findBySpeciality(Speciality speciality);
}