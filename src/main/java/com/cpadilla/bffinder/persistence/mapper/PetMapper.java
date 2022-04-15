package com.cpadilla.bffinder.persistence.mapper;

import com.cpadilla.bffinder.domain.Pet;
import com.cpadilla.bffinder.persistence.entity.PetEntity;
import org.mapstruct.*;

import java.util.List;


@Mapper(componentModel = "spring", uses = {BreedMapper.class,
        UserMapper.class, ImageMapper.class})
public interface PetMapper {


    @Mappings({
            @Mapping(source = "petId", target = "petId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "weight", target = "weight"),
            @Mapping(source = "age", target = "age"),
            @Mapping(source = "vaccinated", target = "vaccinated"),
            @Mapping(source = "dangerous", target = "dangerous"),
            @Mapping(source = "size", target = "size"),
            @Mapping(source = "sterilized", target = "sterilized"),
            @Mapping(source = "status", target = "active"),
            @Mapping(source = "sex", target = "sex"),
            @Mapping(source = "breedId", target = "breedId"),
            @Mapping(source = "ownerId", target = "ownerId"),
            @Mapping(source = "imageEntities", target = "photos"),
            @Mapping(source = "breedEntity", target = "breed"),
            @Mapping(source = "userEntity", target = "owner"),
    })
    Pet toPet(PetEntity petEntity);

    List<Pet> toPets(List<PetEntity> petEntities);

//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "breedEntity", ignore = true),
            @Mapping(target = "userEntity", ignore = true),
            @Mapping(target = "adoptionPostEntity", ignore = true)
    })
    PetEntity toPetEntity(Pet pet);


}
