package com.exam;

import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(ExamserverApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting Code! ");
//        User user = new User();
//        user.setFirstName("Dhruv");
//        user.setLastName("Dogra");
//        user.setUsername("T1 Dhruv");
//        user.setPassword("abc");
//        user.setEmail("ddograd@xyzmail.com");
//        user.setProfile("default.png");
//
//        Role role1 = new Role();
//        role1.setRoleId(44L);
//        role1.setRoleName("ADMIN");
//
//        Set<UserRole> userRoleSet = new HashSet<>();
//        UserRole userRole = new UserRole();
//        userRole.setRole(role1);
//        userRole.setUser(user);
//        userRoleSet.add(userRole);
//        User user1=this.userService.createUser(user,userRoleSet);
//        System.out.println(user1.getUsername());
    }
}
