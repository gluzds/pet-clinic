package com.manutencao.petclinic.service.pet;
import com.manutencao.petclinic.dto.PetDTO;
import com.manutencao.petclinic.entity.Pet;
import com.manutencao.petclinic.entity.User;
import com.manutencao.petclinic.repository.IPetRepository;
import com.manutencao.petclinic.service.user.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PetServiceImpl implements IPetService{
    private final IPetRepository repository;
    private final IUserService userService;

    @Override
    public Pet save(PetDTO petDTO) {
        return this.repository.save(this.dtoToEntity(petDTO));
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
        User user = this.userService.findById(userId);
        return this.repository.findAllByOwner(user);
    }

    private Pet dtoToEntity(PetDTO petDTO){
        return Pet.builder()
                .birthday(petDTO.getBirthday())
                .breed(petDTO.getBreed())
                .owner(userService.findById(petDTO.getOwnerId()))
                .photoUrl(petDTO.getPhotoUrl())
                .build();
    }
}
