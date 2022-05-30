package com.cpadilla.bffinder.domain.repository;

import com.cpadilla.bffinder.domain.AdoptionPost;

import java.util.List;
import java.util.Optional;

public interface IAdoptionPostRepository {

    List<AdoptionPost> getHomePosts();

    Optional<AdoptionPost> getById(int AdoptionPostId);

    AdoptionPost save(AdoptionPost adoptionPost);
}
