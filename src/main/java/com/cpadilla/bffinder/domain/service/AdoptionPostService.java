package com.cpadilla.bffinder.domain.service;

import com.cpadilla.bffinder.domain.AdoptionPost;
import com.cpadilla.bffinder.domain.Pet;
import com.cpadilla.bffinder.domain.repository.IAdoptionPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdoptionPostService {

    @Autowired
    private IAdoptionPostRepository repository;


    public List<AdoptionPost> getHomePosts() {
        return repository.getHomePosts();
    }

    public AdoptionPost save(AdoptionPost adoptionPost){
//        Pet pet = adoptionPost.getPet();
//        pet.setAdoptionPost(adoptionPost);

        return repository.save(adoptionPost);
    }
}
