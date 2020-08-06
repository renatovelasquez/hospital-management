package io.renato.hospital.patient.service;

import io.renato.hospital.patient.entity.Hospital;

import java.util.Date;
import java.util.List;

public interface HospitalService {
    List<Hospital> listAllHospitals();

    Hospital getHospital(Long id);

    Hospital createHospital(Hospital hospital);

    Hospital updateHospital(Hospital hospital);

    void deleteHospital(Long id);

    List<Hospital> findByName(String name);

    List<Hospital> findByCreatedAt(Date date);

}