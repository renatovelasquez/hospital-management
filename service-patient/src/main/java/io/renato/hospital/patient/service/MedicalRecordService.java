package io.renato.hospital.patient.service;

import io.renato.hospital.patient.entity.MedicalRecord;
import io.renato.hospital.patient.entity.Patient;

import java.util.List;

public interface MedicalRecordService {
    List<MedicalRecord> listAllRecords();

    MedicalRecord getRecord(Long id);

    MedicalRecord createRecord(MedicalRecord record);

    MedicalRecord updateMedicalRecord(MedicalRecord medicalRecord);

    void deleteRecord(Long id);

    List<MedicalRecord> finByPatient(Patient patient);
}