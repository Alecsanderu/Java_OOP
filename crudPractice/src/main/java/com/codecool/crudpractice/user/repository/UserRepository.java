package com.codecool.crudpractice.user.repository;

import com.codecool.crudpractice.user.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Long> {

	Optional<AppUser> getByEmail(String email);
	Optional<AppUser> findByUsername(String username);
}
