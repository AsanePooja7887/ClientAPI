package com.demoAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoAPI.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUsernameContaining(String username);
}
