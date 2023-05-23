package com.manutencao.petclinic.service.appointment;
import com.manutencao.petclinic.entity.Appointment;
import com.manutencao.petclinic.repository.IAppoitmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AppoitmentServiceImpl implements IAppointmentService{
    private final IAppoitmentRepository repository;
    @Override
    public Appointment save(Appointment appointment) {
        return this.repository.save(appointment);
    }

    @Override
    public Appointment findById(long id){
        return this.repository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Appointment> findAll(){
        return this.repository.findAll();
    }
}
