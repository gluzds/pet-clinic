package com.manutencao.petclinic.service.pet;
import com.manutencao.petclinic.entity.Pet;
import com.manutencao.petclinic.entity.User;
import com.manutencao.petclinic.repository.IPetRepository;
import com.manutencao.petclinic.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PetServiceImpl implements IPetService{
    private final IPetRepository repository;
    private final IUserRepository userRepository;

    @Override
    public Pet save(Pet pet) {
        return this.repository.save(pet);
    }

    @Override
    public Pet findById(long id) {
        return this.repository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Pet> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<Pet> findAllByUser(long userId) {
        Optional<User> user = this.userRepository.findById(userId);
        if(user.isEmpty()){
            throw new RuntimeException("Usuário não encontrado");
        } else {
            return this.repository.findAllByUser(user.get());
        }
    }
}
