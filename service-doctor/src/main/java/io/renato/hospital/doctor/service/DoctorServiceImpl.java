package io.renato.hospital.doctor.service;

import io.renato.hospital.doctor.entity.Doctor;
import io.renato.hospital.doctor.repository.DoctorRepository;
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
        doctor.setFechaCreacion(new Date());
        doctor.setUsuarioCreador("CREATED");
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) {
        if (doctor != null) {
            doctor.setFechaModificacion(new Date());
            doctor.setUsuarioModificador("UPDATED");
            return doctorRepository.save(doctor);
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
