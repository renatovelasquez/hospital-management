package io.renato.hospital.service;

import io.renato.hospital.entity.Doctor;
import io.renato.hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public List<Doctor> listAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctor(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }

    @Override
    public Doctor createDoctor(Doctor doctor) {
        doctor.setCreatedAt(new Date());
        doctor.setCreatedBy("CREATED");
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) {
        Doctor foundDoctor = doctorRepository.findById(doctor.getId()).orElse(null);
        if (foundDoctor != null) {
            foundDoctor.setName(doctor.getName());
            foundDoctor.setLastName(doctor.getLastName());
            foundDoctor.setBirthDate(doctor.getBirthDate());
            foundDoctor.setAddress(doctor.getAddress());
            foundDoctor.setPhoto(doctor.getPhoto());
            foundDoctor.setUpdatedAt(new Date());
            foundDoctor.setUpdatedBy("UPDATED");
            return doctorRepository.save(foundDoctor);
        }
        return null;
    }

    @Override
    public void deleteDoctor(Long id) {
        if (id != null) {
            doctorRepository.findById(id).ifPresent(doctor -> doctorRepository.delete(doctor));
        }
    }

//    @Override
//    public List<Doctor> findBySpeciality(Speciality speciality) {
//        return doctorRepository.findBySpeciality(speciality);
//    }
}
