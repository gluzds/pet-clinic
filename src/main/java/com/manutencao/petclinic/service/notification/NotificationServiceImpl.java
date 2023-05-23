package com.manutencao.petclinic.service.notification;
import com.manutencao.petclinic.dto.NotificationDTO;
import com.manutencao.petclinic.entity.Notification;
import com.manutencao.petclinic.repository.INotificationRepository;
import com.manutencao.petclinic.service.user.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NotificationServiceImpl implements INotificationService{
    private final INotificationRepository repository;
    private final IUserService userService;

    @Override
    public Notification save(NotificationDTO notificationDTO) {
        return this.repository.save(this.dtoToEntity(notificationDTO));
    }

    @Override
    public Notification findById(long id) {
        return this.repository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Notification> findAll() {
        return this.repository.findAll();
    }

    private Notification dtoToEntity(NotificationDTO notificationDTO){
        return Notification.builder()
                .notification(notificationDTO.getNotification())
                .viewed(false)
                .user(userService.findById(notificationDTO.getUserId()))
                .build();
    }
}
