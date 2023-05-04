package com.workshop.user.mapper;

import com.workshop.user.dto.UserTypeDTO;
import com.workshop.user.entity.UserType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserTypeMapper {

//    @Mapping(target = "users", ignore = true)
    UserTypeDTO toDTO(UserType userType);

    List<UserTypeDTO> toDTOList(List<UserType> userTypes);

    UserType toEntity(UserTypeDTO userTypeDTO);
}
