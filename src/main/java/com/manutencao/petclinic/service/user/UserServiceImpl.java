package com.manutencao.petclinic.service.user;

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
    public User save(User user) {
        return this.repository.save(user);
    }

    @Override
    public User findById(long id) {
        return this.repository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<User> findAll() {
        return this.repository.findAll();
    }
}
