package io.renato.hospital.controller;

import io.renato.hospital.entity.Doctor;
import io.renato.hospital.service.DoctorService;
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

    @GetMapping(value = "/find")
    public ResponseEntity<List<Doctor>> listDoctorByNameAndLastname(@RequestParam(name = "name", required = false) String name, @RequestParam(name = "lastname", required = false) String lastname) {
        List<Doctor> doctors = new ArrayList<>();
        if (name == null)
            name = "";
        if (lastname == null)
            lastname = "";
        doctors = doctorService.findByNameOrLastname(name, lastname);
        if (doctors.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(doctors);
    }

    @GetMapping(value = "/birth")
    public ResponseEntity<List<Doctor>> listDoctorByBirth(@RequestParam(name = "date") String date) {
        try {
            Date date1 = new SimpleDateFormat("yyyyMMdd").parse(date);
            List<Doctor> doctors = new ArrayList<>();
            if (date1 != null)
                doctors = doctorService.findByBirth(date1);
            if (doctors.isEmpty())
                return ResponseEntity.noContent().build();
            return ResponseEntity.ok(doctors);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().build();
    }
}