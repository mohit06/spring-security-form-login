package com.form_login.app.repositories;

import com.form_login.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRegistrationRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
}
