package com.cpadilla.bffinder.persistence.mapper;

import com.cpadilla.bffinder.domain.User;
import com.cpadilla.bffinder.persistence.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(source = "userId", target = "userId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "surname", target = "surname"),
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "socialStratum", target = "socialStratum"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "email", target = "email"),
    })
    User toUser(UserEntity userEntity);

    List<User> toUsers(List<UserEntity> userEntities);

    @InheritInverseConfiguration
    UserEntity toUserEntity(User user);
}
