package io.renato.hospital.patient.controller;

import io.renato.hospital.patient.entity.Doctor;
import io.renato.hospital.patient.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public ResponseEntity<List<Doctor>> listDoctor() {
        List<Doctor> doctors = doctorService.listAllDoctors();
        if (doctors.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(doctors);
    }
}
