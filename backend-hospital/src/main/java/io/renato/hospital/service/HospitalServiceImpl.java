package io.renato.hospital.service;

import io.renato.hospital.entity.Hospital;
import io.renato.hospital.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public List<Hospital> listAllHospitals() {
        return hospitalRepository.findAll();
    }

    @Override
    public Hospital getHospital(Long id) {
        return hospitalRepository.findById(id).orElse(null);
    }

    @Override
    public Hospital createHospital(Hospital hospital) {
        hospital.setCreatedAt(new Date());
        hospital.setCreatedBy("CREATED");
        return hospitalRepository.save(hospital);
    }

    @Override
    public Hospital updateHospital(Hospital hospital) {
        Hospital foundHospital = hospitalRepository.findById(hospital.getId()).orElse(null);
        if (foundHospital != null) {
            foundHospital.setName(hospital.getName());
            foundHospital.setUpdatedAt(new Date());
            foundHospital.setUpdatedBy("UPDATED");
            return hospitalRepository.save(foundHospital);
        }
        return null;
    }

    @Override
    public void deleteHospital(Long id) {
        if (id != null) {
            hospitalRepository.findById(id).ifPresent(hospital -> hospitalRepository.delete(hospital));
        }
    }

    @Override
    public List<Hospital> findByName(String name) {
        return hospitalRepository.findByNameIgnoreCaseContains(name);
    }

    @Override
    public List<Hospital> findByCreatedAt(Date date) {
        return hospitalRepository.findByCreatedAt(date);
    }
}
