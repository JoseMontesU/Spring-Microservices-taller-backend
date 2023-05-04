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

    @Transactional
    @Override
    public UserDTO save(UserDTO userDTO) {
        User userSaved = userRepository.save(userMapper.toEntity(userDTO));
        return userMapper.toDTO(userSaved);
    }

    @Override
    public UserDTO getById(Long id) {
        return userRepository.findById(id).isPresent() ?
                userMapper.toDTO(userRepository.findById(id).get()) : null;
    }

}
