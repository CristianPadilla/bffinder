package com.cpadilla.bffinder.persistence;

import com.cpadilla.bffinder.domain.Pet;
import com.cpadilla.bffinder.domain.repository.IPetRepository;
import com.cpadilla.bffinder.persistence.crud.PetCrudRepository;
import com.cpadilla.bffinder.persistence.entity.PetEntity;
import com.cpadilla.bffinder.persistence.mapper.PetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
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
    public Optional<Pet> getById(int petId) {
        return petCrudRepository.findById(petId)
                .map(petEntity -> mapper.toPet(petEntity));
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
        PetEntity petEntity = mapper.toPetEntity(pet);
        return mapper.toPet(petCrudRepository.save(petEntity));
//        petCrudRepository.save(petEntity);
//        System.out.println(petEntity.getPetId());
//        if (petCrudRepository.findById(petEntity.getPetId()).isPresent()) {
//            petEntity = petCrudRepository.findById(petEntity.getPetId())
//                    .get();
//            return mapper.toPet(petEntity);
//        } else {
//            System.out.println("NULLLLLLLLL");
//            return null;
//        }

    }

    @Override
    public Optional<Pet> update(Pet petDetails) {
        PetEntity petEntity;
        if (petCrudRepository.findById(petDetails.getPetId()).isPresent()) {
            petEntity = petCrudRepository.findById(petDetails.getPetId()).get();
            petDetails.setOwnerId(petEntity.getOwnerId());// forbidden to change the owner id
            petEntity = mapper.toPetEntity(petDetails);
            return Optional.of(mapper.toPet(petCrudRepository.save(petEntity)));
        } else return Optional.empty();
    }

    @Override
    public void delete(int petId) {
        petCrudRepository.deleteById(petId);
    }
}
