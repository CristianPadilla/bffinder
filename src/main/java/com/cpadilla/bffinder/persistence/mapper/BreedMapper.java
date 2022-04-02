package com.cpadilla.bffinder.persistence.mapper;

import com.cpadilla.bffinder.domain.Breed;
import com.cpadilla.bffinder.persistence.entity.BreedEntity;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface BreedMapper {

    @Mappings({
            @Mapping(source = "breedId", target = "breedId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "specieId", target = "specieId"),
    })
    Breed toBreed(BreedEntity breedEntity);

    @InheritInverseConfiguration
    BreedEntity toBreedEntity(Breed breed);
}
