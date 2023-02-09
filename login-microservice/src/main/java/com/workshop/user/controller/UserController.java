package com.workshop.user.controller;

import com.workshop.user.dto.UserDTO;
import com.workshop.user.entity.User;
import com.workshop.user.repository.UserRepository;
import com.workshop.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAll(){
        try {
            return new ResponseEntity<>(userService.getAll(),HttpStatus.OK);
        }catch (Exception e){
            log.info("error log: "+e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody UserDTO userDTO){
        return new ResponseEntity<>(userService.save(userDTO), HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getById(@PathVariable("id") Long id){
        return userService.getById(id)==null?
                new ResponseEntity<>(HttpStatus.NOT_FOUND):
                new ResponseEntity<>(userService.getById(id), HttpStatus.OK);
    }
}
