package com.manutencao.petclinic.repository;

import com.manutencao.petclinic.entity.MedicalRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IMedicalRecordRepository extends CrudRepository<MedicalRecord, Long> {
    List<MedicalRecord> findAll();
}
