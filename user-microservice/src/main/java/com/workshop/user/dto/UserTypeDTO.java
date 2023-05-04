package com.workshop.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.workshop.user.entity.User;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class UserTypeDTO {
    private Long id;
    private String name;
    @JsonIgnore
    private List<User> users;
}
