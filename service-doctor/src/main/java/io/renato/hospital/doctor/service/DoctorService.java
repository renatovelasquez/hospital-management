package io.renato.hospital.doctor.service;

import io.renato.hospital.doctor.entity.Doctor;
import io.renato.hospital.doctor.entity.Speciality;

import java.util.List;

public interface DoctorService {
    List<Doctor> listAllDoctors();

    Doctor getDoctor(Long id);

    Doctor createDoctor(Doctor doctor);

    Doctor updateDoctor(Doctor doctor);

    void deleteDoctor(Long id);

//    List<Doctor> findBySpeciality(Speciality speciality);

//    public Doctor updateStock(Long id, Double quantity);
}