package com.cpadilla.bffinder.persistence.crud;

import com.cpadilla.bffinder.persistence.entity.AdoptionPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AdoptionPostCrudRepository extends JpaRepository<AdoptionPostEntity, Integer> {

    Optional<List<AdoptionPostEntity>> findAllByStatusIsTrueOrderByDateDesc();
}
