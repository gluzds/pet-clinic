package com.manutencao.petclinic.service.notification;

import com.manutencao.petclinic.dto.NotificationDTO;
import com.manutencao.petclinic.entity.Notification;

import java.util.List;

public interface INotificationService {
    Notification save(NotificationDTO notificationDTO);
    Notification findById(long id);
    List<Notification> findAll();
}
