package com.workshop.user.controller;

import com.workshop.user.dto.UserTypeDTO;
import com.workshop.user.entity.UserType;
import com.workshop.user.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usertype")
@CrossOrigin("*")
public class UserTypeController {

    @Autowired
    UserTypeService userTypeService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(userTypeService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        return userTypeService.getById(id)==null?
                new ResponseEntity<>(HttpStatus.NOT_FOUND) :
                new ResponseEntity<>(userTypeService.getById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody UserTypeDTO userTypeDTO){
        return new ResponseEntity<>(userTypeService.save(userTypeDTO),HttpStatus.CREATED);
    }
}
