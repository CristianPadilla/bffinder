package com.cpadilla.bffinder.domain.repository;

import com.cpadilla.bffinder.domain.Pet;
import com.cpadilla.bffinder.domain.User;

import java.util.List;
import java.util.Optional;

public interface IUserRepository {

    Optional<User> getById(int userId);

    Optional<List<User>> getAll();

    User save(User user);

    Optional<User> update(User userDetails);

    void delete(int userId);
}
