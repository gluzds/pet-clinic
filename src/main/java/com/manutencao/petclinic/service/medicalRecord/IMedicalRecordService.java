package com.manutencao.petclinic.service.medicalRecord;

import com.manutencao.petclinic.dto.MedicalRecordDTO;
import com.manutencao.petclinic.entity.MedicalRecord;

import java.util.List;

public interface IMedicalRecordService {
    MedicalRecord save(MedicalRecordDTO medicalRecordDTO);
    MedicalRecord findById(long id);
    List<MedicalRecord> findAll();
}
