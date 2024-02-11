package com.demoAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.StudentDemo.Student.model.StudentEntity;
import com.demoAPI.model.Client;
import com.demoAPI.repository.ClientRepository;
import com.demoAPI.repository.ClientUsersRepository;

@Service
public interface ClientService {

	 public ResponseEntity<Client> createClient(Client client);

}
