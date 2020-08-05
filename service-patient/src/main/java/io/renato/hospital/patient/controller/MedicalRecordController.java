package io.renato.hospital.patient.controller;

import io.renato.hospital.patient.entity.MedicalRecord;
import io.renato.hospital.patient.entity.Patient;
import io.renato.hospital.patient.service.MedicalRecordService;
import io.renato.hospital.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/records")
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService medicalRecordService;

    @GetMapping
    public ResponseEntity<List<MedicalRecord>> listPatient() {
        List<MedicalRecord> records = medicalRecordService.listAllRecords();
        if (records.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(records);
    }
}
