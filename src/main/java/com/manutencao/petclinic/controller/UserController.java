package com.manutencao.petclinic.controller;

import com.manutencao.petclinic.entity.Pet;
import com.manutencao.petclinic.entity.User;
import com.manutencao.petclinic.service.pet.IPetService;
import com.manutencao.petclinic.service.user.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private final IUserService service;
    private final IPetService petService;

    @GetMapping
    public List<User> findAll(){
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @GetMapping("/{id}/pets")
    public List<Pet> findPetsById(@PathVariable Long id) {
        return this.petService.findAllByUser(id);
    }

    @PostMapping
    public User save(@RequestBody User user) { return this.service.save(user); }
}
