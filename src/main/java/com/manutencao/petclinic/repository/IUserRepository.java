package com.manutencao.petclinic.repository;

import com.manutencao.petclinic.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IUserRepository extends CrudRepository<User, Long> {
    List<User> findAll();
}
