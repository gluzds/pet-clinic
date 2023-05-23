package com.manutencao.petclinic.controller;

import com.manutencao.petclinic.dto.PetDTO;
import com.manutencao.petclinic.entity.Pet;
import com.manutencao.petclinic.service.pet.IPetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/pets")
public class PetController {
    private final IPetService service;

    @GetMapping
    public List<Pet> findAll(){
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public Pet findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping
    public Pet save(@RequestBody PetDTO petDTO) { return this.service.save(petDTO); }
}
