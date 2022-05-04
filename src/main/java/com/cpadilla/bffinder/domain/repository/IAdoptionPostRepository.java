package com.cpadilla.bffinder.domain.repository;

import com.cpadilla.bffinder.domain.AdoptionPost;

import java.util.List;

public interface IAdoptionPostRepository {

    List<AdoptionPost> getHomePosts();

    AdoptionPost save(AdoptionPost adoptionPost);
}
