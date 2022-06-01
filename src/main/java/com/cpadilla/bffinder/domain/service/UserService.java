package com.cpadilla.bffinder.domain.service;

import com.cpadilla.bffinder.domain.Pet;
import com.cpadilla.bffinder.domain.User;
import com.cpadilla.bffinder.domain.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public Optional<List<User>> getAll() {
        return userRepository.getAll();
    }

    public Optional<User> getById(int userId) {
        return userRepository.getById(userId);
    }
}
