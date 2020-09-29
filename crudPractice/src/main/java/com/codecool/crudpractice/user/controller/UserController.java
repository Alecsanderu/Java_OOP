package com.codecool.crudpractice.user.controller;


import com.codecool.crudpractice.employees.exception.ResourceNotFoundException;
import com.codecool.crudpractice.user.model.AppUser;

import com.codecool.crudpractice.user.repository.UserRepository;

import com.codecool.crudpractice.user.security.SecurityConfig;
import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@Service
public class UserController {

	private final UserRepository userRepository;
	private final SecurityConfig securityConfig;

	//get users
	@GetMapping("/users")
	public List<AppUser> getAllUsers() {
		return userRepository.findAll();
	}

	//getUserByemail
	@GetMapping("/users/{email}")
	public ResponseEntity<AppUser> getUserByEmail (@PathVariable(name = "email") String email) throws ResourceNotFoundException {
		AppUser appUser = userRepository.getByEmail(email).orElseThrow(() -> new ResourceNotFoundException("User Not Found"));
		return ResponseEntity.ok().body(appUser);
	}

	//saveUser
	@PostMapping("/register")
	public AppUser createUser(@RequestBody AppUser appUser) {
		appUser.setPassword(securityConfig.passwordEncoder().encode(appUser.getPassword()));
		return userRepository.save(appUser);
	}

	//update user
	@PutMapping("/users/{id}")
	public ResponseEntity<AppUser> updateEmployee(@PathVariable(name = "id") Long id, @Valid @RequestBody AppUser appUserDetails) throws ResourceNotFoundException {

		AppUser appUser = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found for this email " + id));
		appUser.setEmail(appUserDetails.getEmail());
		appUser.setUsername(appUserDetails.getUsername());
		appUser.setPassword(appUser.getPassword());

		return ResponseEntity.ok(userRepository.save(appUser));

	}

}
