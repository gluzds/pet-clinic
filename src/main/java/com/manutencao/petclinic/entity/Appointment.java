package com.manutencao.petclinic.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "appointments")
public class Appointment {
  @Id
  @SequenceGenerator(allocationSize = 1, name = "appointments_seq", sequenceName = "appointments_seq")
  @GeneratedValue(generator = "appointments_seq", strategy = GenerationType.SEQUENCE)
  @Column(name = "id")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "pet_id")
  private Pet petId;

  @Column(name = "date")
  private LocalDate date;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User veterinarian;
}
