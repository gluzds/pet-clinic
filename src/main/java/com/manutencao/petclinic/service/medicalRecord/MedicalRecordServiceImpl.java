package com.manutencao.petclinic.service.medicalRecord;
import com.manutencao.petclinic.entity.MedicalRecord;
import com.manutencao.petclinic.repository.IMedicalRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MedicalRecordServiceImpl implements IMedicalRecordService{
    private final IMedicalRecordRepository repository;

    @Override
    public MedicalRecord save(MedicalRecord medicalRecord) {
        return this.repository.save(medicalRecord);
    }

    @Override
    public MedicalRecord findById(long id) {
        return this.repository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<MedicalRecord> findAll() {
        return this.repository.findAll();
    }
}
