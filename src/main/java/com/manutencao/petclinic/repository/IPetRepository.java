package com.manutencao.petclinic.repository;

import com.manutencao.petclinic.entity.Pet;
import com.manutencao.petclinic.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPetRepository extends CrudRepository<Pet, Long> {
    List<Pet> findAll();
    List<Pet> findAllByUser(User user);
}
