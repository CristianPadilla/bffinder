package com.cpadilla.bffinder.persistence.crud;

import com.cpadilla.bffinder.persistence.entity.PetEntity;
import com.cpadilla.bffinder.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserCrudRepository extends CrudRepository<UserEntity, Integer> {

    Optional<UserEntity> findByEmail(String userEmail);
}
