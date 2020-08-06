package io.renato.hospital.patient.controller;

import io.renato.hospital.patient.entity.Hospital;
import io.renato.hospital.patient.service.HospitalService;
import io.renato.hospital.patient.utils.FormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/hospitals")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping
    public ResponseEntity<List<Hospital>> listHospitalByName() {
        List<Hospital> hospitals = hospitalService.listAllHospitals();
        if (hospitals.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(hospitals);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Hospital> getHospital(@PathVariable("id") Long id) {
        Hospital hospital = hospitalService.getHospital(id);
        if (null != hospital)
            return ResponseEntity.ok(hospital);
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Hospital> createHospital(@RequestBody @Valid Hospital hospital, BindingResult result) {
        if (result.hasErrors())
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, FormatUtils.formatMessage(result));
        Hospital hospitalCreate = hospitalService.createHospital(hospital);
        return ResponseEntity.status(HttpStatus.CREATED).body(hospitalCreate);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Hospital> updateHospital(@PathVariable("id") Long id, @RequestBody Hospital hospital) {
        hospital.setId(id);
        Hospital hospitalDB = hospitalService.updateHospital(hospital);
        if (hospitalDB != null)
            return ResponseEntity.ok(hospitalDB);
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Hospital> deleteHospital(@PathVariable("id") Long id) {
        Hospital hospital = hospitalService.getHospital(id);
        hospitalService.deleteHospital(id);
        if (hospital != null)
            return ResponseEntity.ok(hospital);
        return ResponseEntity.notFound().build();
    }

    @GetMapping(value = "/find")
    public ResponseEntity<List<Hospital>> listHospitalByName(@RequestParam(name = "name") String name) {
        List<Hospital> hospitals = new ArrayList<>();
        if (!name.isBlank())
            hospitals = hospitalService.findByName(name);
        if (hospitals.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(hospitals);
    }
}