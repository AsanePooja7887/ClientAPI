package com.demoAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.StudentDemo.Student.model.StudentEntity;
import com.demoAPI.model.Client;
import com.demoAPI.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired 
	private ClientRepository clientRepository;
	
	 @Override
	    public ResponseEntity<Client> createClient(Client client) {
	        Client savedClient = clientRepository.save(client);
	        return new ResponseEntity<>(savedClient, HttpStatus.CREATED);
	    }


}
