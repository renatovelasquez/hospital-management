package io.renato.hospital.patient.repository;

import io.renato.hospital.patient.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {

    List<Hospital> findByNameIgnoreCaseContains(String name);

    List<Hospital> findByCreatedAt(Date date);

}