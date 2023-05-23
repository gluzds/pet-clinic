package com.manutencao.petclinic.controller;

import com.manutencao.petclinic.entity.Appointment;
import com.manutencao.petclinic.service.appointment.IAppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/appoitments")
public class AppoitmentController {
    private final IAppointmentService service;

    @GetMapping
    public List<Appointment> findAll(){
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public Appointment findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping
    public Appointment save(@RequestBody Appointment appointment) {
        return this.service.save(appointment);
    }
}
