package com.manutencao.petclinic.repository;

import com.manutencao.petclinic.entity.Notification;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface INotificationRepository extends CrudRepository<Notification, Long> {
    List<Notification> findAll();
}
