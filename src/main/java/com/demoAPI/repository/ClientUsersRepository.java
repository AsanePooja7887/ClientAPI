package com.demoAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoAPI.model.ClientUsers;
import com.demoAPI.model.User;

public interface ClientUsersRepository extends JpaRepository<ClientUsers, Long> {
    List<ClientUsers> findByUser(User user);

}