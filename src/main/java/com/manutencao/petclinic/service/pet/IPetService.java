package com.manutencao.petclinic.service.pet;

import com.manutencao.petclinic.dto.PetDTO;
import com.manutencao.petclinic.entity.Pet;

import java.util.List;

public interface IPetService {
    Pet save(PetDTO petDTO);
    Pet findById(long id);
    List<Pet> findAll();
    List<Pet> findAllByUser(long userId);
}
