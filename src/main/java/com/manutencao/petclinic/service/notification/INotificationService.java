package com.manutencao.petclinic.service.notification;

import com.manutencao.petclinic.entity.Appointment;
import com.manutencao.petclinic.entity.Notification;

import java.util.List;

public interface INotificationService {
    Notification save(Notification notification);
    Notification findById(long id);
    List<Notification> findAll();
}
