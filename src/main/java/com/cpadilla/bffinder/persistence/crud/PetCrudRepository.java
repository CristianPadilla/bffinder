package com.cpadilla.bffinder.persistence.crud;

import com.cpadilla.bffinder.persistence.entity.PetEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PetCrudRepository extends CrudRepository<PetEntity, Integer> {

    Optional<List<PetEntity>> findByOwnerIdOrderByName(int ownerId);

    Optional<List<PetEntity>> findByBreedId(int breedId);

//    Optional<List<PetEntity>> (int breedId);


}
