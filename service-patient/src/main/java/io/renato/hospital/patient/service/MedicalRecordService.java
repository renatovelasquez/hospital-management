package io.renato.hospital.patient.service;

import io.renato.hospital.patient.entity.MedicalRecord;

import java.util.List;

public interface MedicalRecordService {
    List<MedicalRecord> listAllRecords();

    MedicalRecord getRecord(Long id);

    MedicalRecord createRecord(MedicalRecord record);

    MedicalRecord updateRecord(MedicalRecord record);

    void deleteRecord(Long id);
}