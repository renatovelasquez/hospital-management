package io.renato.hospital.service;

import io.renato.hospital.entity.MedicalRecord;
import io.renato.hospital.entity.Patient;
import io.renato.hospital.repository.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    @Override
    public List<MedicalRecord> listAllRecords() {
        return medicalRecordRepository.findAll();
    }

    @Override
    public MedicalRecord getRecord(Long id) {
        return medicalRecordRepository.findById(id).orElse(null);
    }

    @Override
    public MedicalRecord createRecord(MedicalRecord record) {
        record.setCreatedAt(new Date());
        record.setCreatedBy("CREATED");
        return medicalRecordRepository.save(record);
    }

    @Override
    public MedicalRecord updateMedicalRecord(MedicalRecord medicalRecord) {
        MedicalRecord foundMedicalRecord = medicalRecordRepository.findById(medicalRecord.getId()).orElse(null);
        if (foundMedicalRecord != null) {
            foundMedicalRecord.setDescription(medicalRecord.getDescription());
            foundMedicalRecord.setRecordDate(medicalRecord.getRecordDate());
            foundMedicalRecord.setUpdatedAt(new Date());
            foundMedicalRecord.setUpdatedBy("UPDATED");
            return medicalRecordRepository.save(foundMedicalRecord);
        }
        return null;
    }

    @Override
    public void deleteRecord(Long id) {
        if (id != null) {
            medicalRecordRepository.findById(id).ifPresent(medicalRecord -> medicalRecordRepository.delete(medicalRecord));
        }
    }

    @Override
    public List<MedicalRecord> finByPatient(Patient patient) {
        return medicalRecordRepository.findByPatient(patient);
    }
}