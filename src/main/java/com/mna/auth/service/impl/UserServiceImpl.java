package com.mna.auth.service.impl;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mna.auth.model.User;
import com.mna.auth.repository.RoleRepository;
import com.mna.auth.repository.UserRepository;
import com.mna.auth.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    public void save(User user) {
        user.setPassword(user.getPassword());
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
