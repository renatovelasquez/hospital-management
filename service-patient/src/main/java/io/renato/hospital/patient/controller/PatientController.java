package io.renato.hospital.patient.controller;

import io.renato.hospital.patient.entity.Patient;
import io.renato.hospital.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public ResponseEntity<List<Patient>> listPatient() {
        List<Patient> patients = patientService.listAllPatients();
        if (patients.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(patients);
    }
}
