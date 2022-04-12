package com.cpadilla.bffinder.persistence;

import com.cpadilla.bffinder.domain.Pet;
import com.cpadilla.bffinder.domain.User;
import com.cpadilla.bffinder.domain.repository.IUserRepository;
import com.cpadilla.bffinder.persistence.crud.UserCrusRepository;
import com.cpadilla.bffinder.persistence.entity.PetEntity;
import com.cpadilla.bffinder.persistence.entity.UserEntity;
import com.cpadilla.bffinder.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository implements IUserRepository {

    @Autowired
    private UserCrusRepository userCrusRepository;

    @Autowired
    private UserMapper mapper;


    @Override
    public Optional<User> getById(int userId) {
        return Optional.empty();
    }

    @Override
    public Optional<List<User>> getAll() {
        List<UserEntity> userEntities = (List<UserEntity>) userCrusRepository.findAll();
        return Optional.of(mapper.toUsers(userEntities));
    }

    @Override
    public Pet save(User user) {
        return null;
    }

    @Override
    public Optional<User> update(User userDetails) {
        return Optional.empty();
    }


    @Override
    public void delete(int petId) {

    }
}
