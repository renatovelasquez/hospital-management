package io.renato.hospital.patient.service;

import io.renato.hospital.patient.entity.MedicalRecord;
import io.renato.hospital.patient.repository.MedicalRecordRepository;
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
        record.setFechaCreacion(new Date());
        record.setUsuarioCreador("CREATED");
        return medicalRecordRepository.save(record);
    }

    @Override
    public MedicalRecord updateRecord(MedicalRecord record) {
        if (record != null) {
            record.setFechaModificacion(new Date());
            record.setUsuarioModificador("UPDATED");
            return medicalRecordRepository.save(record);
        }
        return null;
    }

    @Override
    public void deleteRecord(Long id) {
        if (id != null) {
            medicalRecordRepository.findById(id).ifPresent(patient -> medicalRecordRepository.delete(patient));
        }
    }
}