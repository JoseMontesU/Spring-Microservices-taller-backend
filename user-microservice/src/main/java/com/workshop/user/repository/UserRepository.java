package com.workshop.user.repository;

import com.workshop.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

public interface UserRepository extends JpaRepository<User,Long>{

    @Query( value = "select * from USER_ENTITY", nativeQuery = true)
    List<User> obtenerTodo();
}
