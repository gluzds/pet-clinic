package com.manutencao.petclinic.service.user;

import com.manutencao.petclinic.dto.UserDTO;
import com.manutencao.petclinic.entity.User;
import com.manutencao.petclinic.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements IUserService{
    private final IUserRepository repository;

    @Override
    public User save(UserDTO userDTO) {
        return this.repository.save(this.dtoToEntity(userDTO));
    }

    @Override
    public User findById(long id) {
        return this.repository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<User> findAll() {
        return this.repository.findAll();
    }

    private User dtoToEntity(UserDTO userDTO){
        return User.builder()
                .cellphone(userDTO.getCellphone())
                .email(userDTO.getEmail())
                .fullName(userDTO.getFullName())
                .build();
    }
}
