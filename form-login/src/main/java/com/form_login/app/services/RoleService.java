package com.form_login.app.services;

import com.form_login.app.entity.Roles;
import com.form_login.app.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class RoleService {

    @Autowired
    private RoleRepository repo;

    public Roles getRoleByValue(String role){
        return repo.findByRole(role).orElseThrow();
    }

    public List<Roles> getAllRoles(){
        return repo.findAll().stream().toList();
    }

}
