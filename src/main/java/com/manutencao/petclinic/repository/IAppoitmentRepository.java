package com.manutencao.petclinic.repository;

import com.manutencao.petclinic.entity.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IAppoitmentRepository extends CrudRepository<Appointment, Long> {
    List<Appointment> findAll();
}
