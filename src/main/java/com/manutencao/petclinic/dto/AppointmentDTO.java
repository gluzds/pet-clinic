package com.manutencao.petclinic.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.manutencao.petclinic.entity.Pet;
import com.manutencao.petclinic.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AppointmentDTO {
    private Pet petId;
    private LocalDate date;
    private User veterinarian;
}
