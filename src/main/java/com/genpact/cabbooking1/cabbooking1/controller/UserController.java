package com.genpact.cabbooking1.cabbooking1.controller;

import com.genpact.cabbooking1.cabbooking1.entity.User;
import com.genpact.cabbooking1.cabbooking1.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController()
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;


    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        // Add logic for user registration (validation, password hashing, etc.)
        User registeredUser = userService.registerUser(user);
        return ResponseEntity.ok(registeredUser);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{userId}")
    public ResponseEntity<User> updateUser( @RequestBody User updatedUser) {
        User user = userService.updateUser(updatedUser);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
}
