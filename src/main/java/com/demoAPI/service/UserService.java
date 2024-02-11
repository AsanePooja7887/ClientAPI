package com.demoAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoAPI.model.User;
import com.demoAPI.repository.UserRepository;

@Service
public class UserService {

	 @Autowired
	    private UserRepository userRepository;

	    public List<User> getUsersByUsername(String username) {
	        return userRepository.findByUsernameContaining(username);
	    }

	    public User updateUserFields(Long userId, User updatedUser) {
			return updatedUser;
	        // logic to update user fields
	    }
	    // other methods
	}

