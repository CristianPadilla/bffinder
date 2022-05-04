package com.cpadilla.bffinder.persistence;

import com.cpadilla.bffinder.domain.AdoptionPost;
import com.cpadilla.bffinder.domain.repository.IAdoptionPostRepository;
import com.cpadilla.bffinder.persistence.crud.AdoptionPostCrudRepository;
import com.cpadilla.bffinder.persistence.entity.AdoptionPostEntity;
import com.cpadilla.bffinder.persistence.mapper.AdoptionPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class AdoptionPostRepository implements IAdoptionPostRepository {

    @Autowired
    private AdoptionPostCrudRepository crudRepository;

    @Autowired
    private AdoptionPostMapper mapper;

    @Override
    public List<AdoptionPost> getHomePosts() {
        Optional<List<AdoptionPostEntity>> adoptionPostEntities = crudRepository.findAllByStatusIsTrueOrderByDateDesc();
        return adoptionPostEntities.map(adoptionPostEntities1 -> mapper.toAdoptionPosts(adoptionPostEntities1))
                .orElse(Collections.emptyList());
    }

    @Override
    public AdoptionPost save(AdoptionPost adoptionPost) {

        AdoptionPostEntity adoptionPostEntity = crudRepository.save(mapper.toAdoptionPostEntity(adoptionPost));
        return mapper.toAdoptionPost(adoptionPostEntity);
    }
}
