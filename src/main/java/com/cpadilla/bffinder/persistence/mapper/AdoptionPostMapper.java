package com.cpadilla.bffinder.persistence.mapper;

import com.cpadilla.bffinder.domain.AdoptionPost;
import com.cpadilla.bffinder.persistence.entity.AdoptionPostEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = PetMapper.class)
public interface AdoptionPostMapper {

    @Mappings({
            @Mapping(source = "adoptionPostId", target = "adoptionPostId"),
            @Mapping(source = "date", target = "date"),
            @Mapping(source = "description", target = "details"),
            @Mapping(source = "status", target = "active"),
//            @Mapping(source = "petId", target = "petId"),
            @Mapping(source = "petEntity", target = "pet"),
    })
    AdoptionPost toAdoptionPost(AdoptionPostEntity adoptionPostEntity);

    List<AdoptionPost> toAdoptionPosts(List<AdoptionPostEntity> adoptionPostEntities);

    @InheritInverseConfiguration
    AdoptionPostEntity toAdoptionPostEntity(AdoptionPost adoptionPost);
}
