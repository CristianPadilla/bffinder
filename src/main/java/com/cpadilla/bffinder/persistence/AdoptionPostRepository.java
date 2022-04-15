package com.cpadilla.bffinder.persistence;

import com.cpadilla.bffinder.domain.AdoptionPost;
import com.cpadilla.bffinder.domain.repository.IAdoptionPostRepository;
import com.cpadilla.bffinder.persistence.crud.AdoptionPostCrudRepository;
import com.cpadilla.bffinder.persistence.entity.AdoptionPostEntity;
import com.cpadilla.bffinder.persistence.mapper.AdoptionPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdoptionPostRepository implements IAdoptionPostRepository {

    @Autowired
    private AdoptionPostCrudRepository crudRepository;

    @Autowired
    private AdoptionPostMapper mapper;

    @Override
    public List<AdoptionPost> getAllRandom() {
        List<AdoptionPostEntity> adoptionPostEntities = (List<AdoptionPostEntity>) crudRepository.findAll();
        return mapper.toAdoptionPosts(adoptionPostEntities);
    }
}
