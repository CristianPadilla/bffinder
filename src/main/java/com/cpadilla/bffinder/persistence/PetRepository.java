package com.cpadilla.bffinder.persistence;

import com.cpadilla.bffinder.domain.Pet;
import com.cpadilla.bffinder.domain.repository.IPetRepository;
import com.cpadilla.bffinder.persistence.crud.PetCrudRepository;
import com.cpadilla.bffinder.persistence.entity.PetEntity;
import com.cpadilla.bffinder.persistence.mapper.PetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PetRepository implements IPetRepository {

    @Autowired
    private PetCrudRepository petCrudRepository;

    @Autowired
    private PetMapper mapper;

    @Override
    public Optional<List<Pet>> getByOwner(int ownerId) {
        return petCrudRepository.findByOwnerIdOrderByName(ownerId).map(petEntities -> mapper.toPets(petEntities));
    }

    @Override
    public Optional<List<Pet>> getAll() {
        List<PetEntity> petEntities = (List<PetEntity>) petCrudRepository.findAll();
        return Optional.of(mapper.toPets(petEntities));
    }

    @Override
    public Optional<List<Pet>> getByBreed(int breedId) {
        return petCrudRepository.findByBreedId(breedId)
                .map(petEntities -> mapper.toPets(petEntities));
    }

    @Override
    public Pet save(Pet pet) {
        return null;
    }

    @Override
    public Pet update(Pet petDetails) {
        return null;
    }

    @Override
    public void delete(int petId) {

    }
}
