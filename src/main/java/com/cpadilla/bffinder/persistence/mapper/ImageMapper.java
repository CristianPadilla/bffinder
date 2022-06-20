package com.cpadilla.bffinder.persistence.mapper;

import com.cpadilla.bffinder.domain.Photo;
import com.cpadilla.bffinder.persistence.entity.ImageEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ImageMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "src", target = "src"),
            @Mapping(source = "petId", target = "petId"),
    })
    Photo topPhoto(ImageEntity imageEntity);

    List<Photo> topPhotos(List<ImageEntity> imageEntities);

    @InheritInverseConfiguration
    @Mapping(target = "petEntity", ignore = true)
    ImageEntity toImageEntity(Photo photo);

    List<ImageEntity> toImageEntities(List<Photo> photos);


}
