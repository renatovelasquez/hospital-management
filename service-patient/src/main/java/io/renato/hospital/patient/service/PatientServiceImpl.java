package io.renato.hospital.patient.service;

import io.renato.hospital.patient.entity.Patient;
import io.renato.hospital.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> listAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatient(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    @Override
    public Patient createPatient(Patient patient) {
        patient.setCreatedAt(new Date());
        patient.setCreatedBy("CREATED");
        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        Patient foundPatient = patientRepository.findById(patient.getId()).orElse(null);
        if (foundPatient != null) {
            foundPatient.setName(patient.getName());
            foundPatient.setLastName(patient.getLastName());
            foundPatient.setBirthDate(patient.getBirthDate());
            foundPatient.setAddress(patient.getAddress());
            foundPatient.setPhoto(patient.getPhoto());
            foundPatient.setUpdatedAt(new Date());
            foundPatient.setUpdatedBy("UPDATED");
            return patientRepository.save(foundPatient);
        }
        return null;
    }

    @Override
    public void deletePatient(Long id) {
        if (id != null) {
            patientRepository.findById(id).ifPresent(patient -> patientRepository.delete(patient));
        }
    }

//    @Override
//    public List<Patient> findBySpeciality(Speciality speciality) {
//        return patientRepository.findBySpeciality(speciality);
//    }
}
