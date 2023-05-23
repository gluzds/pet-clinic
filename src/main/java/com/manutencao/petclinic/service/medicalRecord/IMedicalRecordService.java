package com.manutencao.petclinic.service.medicalRecord;

import com.manutencao.petclinic.entity.MedicalRecord;

import java.util.List;

public interface IMedicalRecordService {
    MedicalRecord save(MedicalRecord medicalRecord);
    MedicalRecord findById(long id);
    List<MedicalRecord> findAll();
}
