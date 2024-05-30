package com.form_login.app.services;

import com.form_login.app.entity.User;
import com.form_login.app.repositories.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserRegistrationService {

    @Autowired
    PasswordEncoder pwdEnc;

    @Autowired
    UserRegistrationRepository userRegistrationRepository;

    public void createUser(User user) {
        user.setPassword(pwdEnc.encode(user.getPassword()));
        userRegistrationRepository.save(user);
    }

    public User getUserByUsername(String username) {
      return  userRegistrationRepository.findByUsername(username).orElseThrow();
    }
}
