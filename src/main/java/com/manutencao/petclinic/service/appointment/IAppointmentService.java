package com.manutencao.petclinic.service.appointment;

import com.manutencao.petclinic.dto.AppointmentDTO;
import com.manutencao.petclinic.entity.Appointment;

import java.util.List;

public interface IAppointmentService {
    Appointment save(AppointmentDTO appointmentDTO);
    Appointment findById(long id);
    List<Appointment> findAll();
}
