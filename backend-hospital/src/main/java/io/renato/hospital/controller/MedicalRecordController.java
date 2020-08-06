package io.renato.hospital.controller;

import io.renato.hospital.entity.MedicalRecord;
import io.renato.hospital.entity.Patient;
import io.renato.hospital.service.MedicalRecordService;
import io.renato.hospital.utils.FormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/records")
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService medicalRecordService;

    @GetMapping
    public ResponseEntity<List<MedicalRecord>> listRecord(@RequestParam(name = "patientId", required = false) Long idPatient) {
        List<MedicalRecord> records;
        if (idPatient != null) {
            records = medicalRecordService.finByPatient(Patient.builder().id(idPatient).build());
            if (records.isEmpty())
                return ResponseEntity.notFound().build();
        } else {
            records = medicalRecordService.listAllRecords();
            if (records.isEmpty())
                return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(records);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<MedicalRecord> getMedicalRecord(@PathVariable("id") Long id) {
        MedicalRecord record = medicalRecordService.getRecord(id);
        if (null != record)
            return ResponseEntity.ok(record);
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<MedicalRecord> createMedicalRecord(@RequestBody @Valid MedicalRecord record, BindingResult result) {
        if (result.hasErrors())
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, FormatUtils.formatMessage(result));
        MedicalRecord recordCreate = medicalRecordService.createRecord(record);
        return ResponseEntity.status(HttpStatus.CREATED).body(recordCreate);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<MedicalRecord> updateMedicalRecord(@PathVariable("id") Long id, @RequestBody MedicalRecord record) {
        record.setId(id);
        MedicalRecord recordDB = medicalRecordService.updateMedicalRecord(record);
        if (recordDB != null)
            return ResponseEntity.ok(recordDB);
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<MedicalRecord> deleteMedicalRecord(@PathVariable("id") Long id) {
        MedicalRecord record = medicalRecordService.getRecord(id);
        medicalRecordService.deleteRecord(id);
        if (record != null)
            return ResponseEntity.ok(record);
        return ResponseEntity.notFound().build();
    }

//    @GetMapping(value = "/{id}/stock")
//    public ResponseEntity<MedicalRecord> updateStockMedicalRecord(@PathVariable  Long id ,@RequestParam(name = "quantity", required = true) Double quantity){
//        MedicalRecord record = recordService.updateStock(id, quantity);
//        if (record == null){
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(record);
//    }

}