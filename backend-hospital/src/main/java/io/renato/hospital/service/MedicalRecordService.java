package io.renato.hospital.service;

import io.renato.hospital.entity.MedicalRecord;
import io.renato.hospital.entity.Patient;

import java.util.List;

public interface MedicalRecordService {
    List<MedicalRecord> listAllRecords();

    MedicalRecord getRecord(Long id);

    MedicalRecord createRecord(MedicalRecord record);

    MedicalRecord updateMedicalRecord(MedicalRecord medicalRecord);

    void deleteRecord(Long id);

    List<MedicalRecord> finByPatient(Patient patient);
}