package com.demoAPI.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientUsers {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "client_id")
	    private Client client;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;

	    private LocalDateTime createdAt;
	    private LocalDateTime updatedAt;
	    private LocalDateTime deletedAt;

	    private boolean active;
	    // other fields, getters, setters
}
