package io.renato.hospital.service;

import io.renato.hospital.entity.Speciality;

import java.util.List;

public interface SpecialityService {
    List<Speciality> listAllSpecialities();

    Speciality getSpeciality(Long id);

    Speciality createSpeciality(Speciality hospital);

    Speciality updateSpeciality(Speciality hospital);

    void deleteSpeciality(Long id);
}