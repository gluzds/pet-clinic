package com.manutencao.petclinic.service.pet;

import com.manutencao.petclinic.entity.Pet;

import java.util.List;

public interface IPetService {
    Pet save(Pet pet);
    Pet findById(long id);
    List<Pet> findAll();
    List<Pet> findAllByUser(long userId);
}
