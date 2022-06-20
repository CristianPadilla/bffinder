package com.cpadilla.bffinder.domain.service;

import com.cpadilla.bffinder.domain.AdoptionPost;
import com.cpadilla.bffinder.domain.Pet;
import com.cpadilla.bffinder.domain.repository.IAdoptionPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdoptionPostService {

    @Autowired
    private IAdoptionPostRepository repository;


    public List<AdoptionPost> getHomePosts() {
//        List<AdoptionPost> a = repository.getHomePosts();
//        System.out.println("AAAAAAAAAAAAAAAAAAAAA ");

        return repository.getHomePosts();
    }

    public Optional<AdoptionPost>getById(int AdoptionPostId) {
        return repository.getById(AdoptionPostId);
    }

    public AdoptionPost save(AdoptionPost adoptionPost){
//        Pet pet = adoptionPost.getPet();
//        pet.setAdoptionPost(adoptionPost);

        return repository.save(adoptionPost);
    }
}
