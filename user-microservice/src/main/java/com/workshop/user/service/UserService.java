package com.workshop.user.service;

import com.workshop.user.dto.UserDTO;
import com.workshop.user.entity.User;
import com.workshop.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<UserDTO> getAll();
    UserDTO save(UserDTO userDTO);
    UserDTO getById(Long id);

}
