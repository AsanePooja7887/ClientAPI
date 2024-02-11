package com.demoAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.StudentDemo.Student.model.StudentEntity;
import com.demoAPI.model.Client;
import com.demoAPI.repository.ClientRepository;
import com.demoAPI.service.ClientService;

@RestController
@RequestMapping("/api")
public class ClientController {
    @Autowired
    private ClientService clientService;
    
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/test")
    public String getTst()
    {
    	return "working";
    }
    @PostMapping("/clients")
    public ResponseEntity<Client> createClient(@RequestBody Client client){
        System.out.println(client);
        return clientService.createClient(client);
    }

}

