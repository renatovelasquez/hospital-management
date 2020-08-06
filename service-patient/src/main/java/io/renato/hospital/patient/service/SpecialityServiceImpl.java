package io.renato.hospital.patient.service;

import io.renato.hospital.patient.entity.Speciality;
import io.renato.hospital.patient.repository.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SpecialityServiceImpl implements SpecialityService {
    @Autowired
    private SpecialityRepository specialityRepository;

    @Override
    public List<Speciality> listAllSpecialities() {
        return specialityRepository.findAll();
    }

    @Override
    public Speciality getSpeciality(Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public Speciality createSpeciality(Speciality speciality) {
        speciality.setCreatedAt(new Date());
        speciality.setCreatedBy("CREATED");
        return specialityRepository.save(speciality);
    }

    @Override
    public Speciality updateSpeciality(Speciality speciality) {
        Speciality foundSpeciality = specialityRepository.findById(speciality.getId()).orElse(null);
        if (foundSpeciality != null) {
            foundSpeciality.setName(speciality.getName());
            foundSpeciality.setDescription(speciality.getDescription());
            foundSpeciality.setAvatar(speciality.getAvatar());
            foundSpeciality.setUpdatedAt(new Date());
            foundSpeciality.setUpdatedBy("UPDATED");
            return specialityRepository.save(foundSpeciality);
        }
        return null;
    }

    @Override
    public void deleteSpeciality(Long id) {
        if (id != null) {
            specialityRepository.findById(id).ifPresent(speciality -> specialityRepository.delete(speciality));
        }
    }
}