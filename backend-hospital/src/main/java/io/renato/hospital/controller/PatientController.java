package io.renato.hospital.controller;

import io.renato.hospital.entity.Patient;
import io.renato.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    @GetMapping(value = "/find")
    public ResponseEntity<List<Patient>> listPatientByNameAndLastname(@RequestParam(name = "name", required = false) String name, @RequestParam(name = "lastname", required = false) String lastname) {
        List<Patient> patients;
        if (name == null)
            name = "";
        if (lastname == null)
            lastname = "";
        patients = patientService.findByNameOrLastname(name, lastname);
        if (patients.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(patients);
    }

    @GetMapping(value = "/birth")
    public ResponseEntity<List<Patient>> listPatientByBirth(@RequestParam(name = "date") String date) {
        try {
            Date date1 = new SimpleDateFormat("yyyyMMdd").parse(date);
            List<Patient> patients = new ArrayList<>();
            if (date1 != null)
                patients = patientService.findByBirth(date1);
            if (patients.isEmpty())
                return ResponseEntity.noContent().build();
            return ResponseEntity.ok(patients);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().build();
    }
}
