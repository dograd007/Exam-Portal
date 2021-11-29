package com.exam.service.impl;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    // Creating User
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        // Check if user is already in the Database?
        User local = this.userRepository.findByUsername(user.getUsername());
        if (local != null) {
            System.out.println("User is already present in the Database. ");
            throw new Exception("User already present!");
        } else {
            // User Create
            for (UserRole tempRole : userRoles) {
                roleRepository.save(tempRole.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);
        }
        return local;
    }
}
