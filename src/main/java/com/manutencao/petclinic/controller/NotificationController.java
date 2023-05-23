package com.manutencao.petclinic.controller;

import com.manutencao.petclinic.entity.Notification;
import com.manutencao.petclinic.service.notification.INotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/notifications")
public class NotificationController {
    private final INotificationService service;

    @GetMapping
    public List<Notification> findAll(){
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public Notification findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping
    public Notification save(@RequestBody Notification notification) { return this.service.save(notification); }
}
