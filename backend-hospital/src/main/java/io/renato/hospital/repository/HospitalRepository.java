package io.renato.hospital.repository;

import io.renato.hospital.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {

    List<Hospital> findByNameIgnoreCaseContains(String name);

    List<Hospital> findByCreatedAt(Date date);

}