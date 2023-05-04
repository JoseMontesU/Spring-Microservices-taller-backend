package com.workshop.user.service.impl;

import com.workshop.user.dto.UserTypeDTO;
import com.workshop.user.entity.UserType;
import com.workshop.user.mapper.UserTypeMapper;
import com.workshop.user.repository.UserTypeRepository;
import com.workshop.user.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTypeServiceImpl implements UserTypeService {

    @Autowired
    private UserTypeRepository userTypeRepository;

    @Autowired
    private UserTypeMapper userTypeMapper;

    @Override
    public List<UserTypeDTO> getAll() {
        return userTypeMapper.toDTOList(userTypeRepository.findAll());
    }

    @Override
    public UserTypeDTO save(UserTypeDTO userTypeDTO) {
        UserType userTypeSaved = userTypeRepository.save(userTypeMapper.toEntity(userTypeDTO));
        return userTypeMapper.toDTO(userTypeSaved);
    }

    @Override
    public UserTypeDTO getById(Long id) {
        return userTypeRepository.findById(id).isPresent()?
                userTypeMapper.toDTO(userTypeRepository.findById(id).get()) : null;
    }
}
