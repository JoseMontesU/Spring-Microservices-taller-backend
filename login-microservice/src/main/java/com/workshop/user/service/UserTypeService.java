package com.workshop.user.service;

import com.workshop.user.dto.UserTypeDTO;
import com.workshop.user.entity.UserType;

import java.util.List;

public interface UserTypeService {
    List<UserTypeDTO> getAll();
    UserTypeDTO save(UserTypeDTO userTypeDTO);
    UserTypeDTO getById(Long id);
}
