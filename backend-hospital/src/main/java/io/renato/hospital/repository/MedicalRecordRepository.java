package io.renato.hospital.repository;

import io.renato.hospital.entity.MedicalRecord;
import io.renato.hospital.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {

    List<MedicalRecord> findByPatient(Patient patient);
}