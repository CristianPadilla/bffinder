package com.cpadilla.bffinder.persistence.mapper;

import com.cpadilla.bffinder.domain.Specie;
import com.cpadilla.bffinder.persistence.entity.SpecieEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {BreedMapper.class})
public interface SpecieMapper {

    @Mappings({
            @Mapping(source = "specieId", target = "specieId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "breedEntities", target = "breeds"),
    })
    Specie toSpecie(SpecieEntity specieEntity);

    @InheritInverseConfiguration
    SpecieEntity toSpecieEntity(Specie specie);



}
