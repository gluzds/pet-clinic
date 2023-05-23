package com.manutencao.petclinic.service.notification;
import com.manutencao.petclinic.entity.Notification;
import com.manutencao.petclinic.repository.INotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NotificationServiceImpl implements INotificationService{
    private final INotificationRepository repository;

    @Override
    public Notification save(Notification notification) {
        return this.repository.save(notification);
    }

    @Override
    public Notification findById(long id) {
        return this.repository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Notification> findAll() {
        return this.repository.findAll();
    }
}
