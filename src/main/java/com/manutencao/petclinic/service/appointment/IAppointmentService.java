package com.manutencao.petclinic.service.appointment;

import com.manutencao.petclinic.entity.Appointment;

import java.util.List;

public interface IAppointmentService {
    Appointment save(Appointment appointment);
    Appointment findById(long id);
    List<Appointment> findAll();
}
