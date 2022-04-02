package com.cpadilla.bffinder.domain.service;

import com.cpadilla.bffinder.domain.Pet;
import com.cpadilla.bffinder.domain.repository.IPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    @Autowired
    private IPetRepository petRepository;

    public Optional<List<Pet>> getByOwner(int ownerId) {
        return petRepository.getByOwner(ownerId);
    }

    public Optional<List<Pet>> getAll() {
        return petRepository.getAll();
    }

    public Optional<List<Pet>> getByBreed(int breedId) {
        return petRepository.getByBreed(breedId);
    }
}
