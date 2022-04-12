package com.cpadilla.bffinder.persistence.crud;

import com.cpadilla.bffinder.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserCrusRepository extends CrudRepository<UserEntity, Integer> {
}
