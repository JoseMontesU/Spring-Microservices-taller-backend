package com.workshop.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.workshop.user.entity.UserType;
import lombok.Data;

@Data
public class UserDTO {

    private String id;
    private String FIRST_NAME;
    private String LAST_NAME;
    private String EMAIL;
//    private Long userTypeId;
//    private UserTypeDTO userType;

}
