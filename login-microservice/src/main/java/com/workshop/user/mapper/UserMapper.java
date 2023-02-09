package com.workshop.user.mapper;

import com.workshop.user.dto.UserDTO;
import com.workshop.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

//    @Mapping(target = "userType", ignore = true)
    UserDTO toDTO(User user);
    List<UserDTO> toDTOList(List<User> users);
//    @Mapping(target = "userType", ignore = true)
    User toEntity(UserDTO userDTO);
}
