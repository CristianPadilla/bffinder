package com.cpadilla.bffinder.domain.service;

import com.cpadilla.bffinder.domain.AdoptionPost;
import com.cpadilla.bffinder.domain.Pet;
import com.cpadilla.bffinder.domain.repository.IAdoptionPostRepository;
import com.cpadilla.bffinder.domain.repository.IPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdoptionPostService {

    @Autowired
    private IAdoptionPostRepository repository;


    public List<AdoptionPost> getAll() {
        return repository.getAllRandom();
    }
}
