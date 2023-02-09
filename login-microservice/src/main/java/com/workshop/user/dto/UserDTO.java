package com.workshop.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.workshop.user.entity.UserType;
import lombok.Data;

@Data
public class UserDTO {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Long userTypeId;
    private UserTypeDTO userType;

}
