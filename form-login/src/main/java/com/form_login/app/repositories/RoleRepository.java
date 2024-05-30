package com.form_login.app.repositories;

import com.form_login.app.entity.Roles;
import com.form_login.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface RoleRepository extends JpaRepository<Roles, Long> {
    Optional<Roles> findByRole(String role);
}
