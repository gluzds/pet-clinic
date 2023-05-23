package com.manutencao.petclinic.service.appointment;
import com.manutencao.petclinic.entity.Appointment;
import com.manutencao.petclinic.dto.AppointmentDTO;
import com.manutencao.petclinic.repository.IAppoitmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AppointmentServiceImpl implements IAppointmentService{
    private final IAppoitmentRepository repository;
    @Override
    public Appointment save(AppointmentDTO appointmentDTO) {
        return this.repository.save(this.dtoToEntity(appointmentDTO));
    }

    @Override
    public Appointment findById(long id){
        return this.repository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Appointment> findAll(){
        return this.repository.findAll();
    }

    private Appointment dtoToEntity(AppointmentDTO appointmentDTO){
        return Appointment.builder()
                .date(appointmentDTO.getDate())
                .petId(appointmentDTO.getPetId())
                .veterinarian(appointmentDTO.getVeterinarian())
                .build();
    }
}
