package com.demoAPI.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.StudentDemo.Student.model.StudentEntity;
import com.demoAPI.model.Client;
import com.demoAPI.model.Company;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByCompanyAndName(Company company, String name);
    
  
}
