package com.cpadilla.bffinder.domain.repository;

import com.cpadilla.bffinder.domain.Pet;

import java.util.List;
import java.util.Optional;

public interface IPetRepository {
    Optional<List<Pet>> getByOwner(int userId);

    Optional<Pet> getById(int petId);

    Optional<List<Pet>> getAll();

    Optional<List<Pet>> getByBreed(int breedId);

    Pet save(Pet pet);

    Optional<Pet> update(Pet petDetails);

    void delete(int petId);


}
