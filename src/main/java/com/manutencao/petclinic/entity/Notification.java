package com.manutencao.petclinic.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @SequenceGenerator(allocationSize = 1, name = "medical_records_seq", sequenceName = "medical_records_seq")
    @GeneratedValue(generator = "medical_records_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "notification")
    private String notification;

    @Column(name = "viewed")
    private Boolean viewed;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
