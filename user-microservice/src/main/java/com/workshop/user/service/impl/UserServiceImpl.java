package com.workshop.user.service.impl;

import com.workshop.user.dto.UserDTO;
import com.workshop.user.entity.User;
import com.workshop.user.mapper.UserMapper;
import com.workshop.user.repository.UserRepository;
import com.workshop.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserDTO> getAll() {
        return userMapper.toDTOList(userRepository.obtenerTodo());
    }

    @Override
    public UserDTO getById(String id) {
        return userMapper.toDTO(userRepository.findById(id));
    }

}
