package com.manutencao.petclinic.service.medicalRecord;
import com.manutencao.petclinic.dto.MedicalRecordDTO;
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
    public MedicalRecord save(MedicalRecordDTO medicalRecordDTO) {
        return this.repository.save(this.dtoToEntity(medicalRecordDTO));
    }

    @Override
    public MedicalRecord findById(long id) {
        return this.repository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<MedicalRecord> findAll() {
        return this.repository.findAll();
    }

    private MedicalRecord dtoToEntity(MedicalRecordDTO medicalRecordDTO){
        return MedicalRecord.builder()
                .record(medicalRecordDTO.getRecord())
                .date(medicalRecordDTO.getDate())
                .petId(medicalRecordDTO.getPetId())
                .veterinarian(medicalRecordDTO.getVeterinarian())
                .build();
    }
}
