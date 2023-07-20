package com.workshop.user.repository;

import com.workshop.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query( value = "select * from USER_ENTITY where REALM_ID='4072228b-2586-4df3-97e9-443da84cee1e'",
            nativeQuery = true)
    List<User> obtenerTodo();
    @Query( value = "select * from USER_ENTITY where ID=?1"
            ,nativeQuery = true)
    User findById(String id);
}
