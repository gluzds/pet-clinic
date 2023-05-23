package com.manutencao.petclinic.service.user;

import com.manutencao.petclinic.entity.User;

import java.util.List;

public interface IUserService {
    User save(User user);
    User findById(long id);
    List<User> findAll();
}
