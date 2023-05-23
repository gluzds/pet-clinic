package com.manutencao.petclinic.controller;

import com.manutencao.petclinic.dto.MedicalRecordDTO;
import com.manutencao.petclinic.entity.MedicalRecord;
import com.manutencao.petclinic.service.medicalRecord.IMedicalRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/medical-records")
public class MedicalRecordController {
    private final IMedicalRecordService service;

    @GetMapping
    public List<MedicalRecord> findAll(){
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public MedicalRecord findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping
    public MedicalRecord save(@RequestBody MedicalRecordDTO medicalRecordDTO) {
        return this.service.save(medicalRecordDTO);
    }
}
