package com.genpact.cabbooking1.cabbooking1.services.impl;

import com.genpact.cabbooking1.cabbooking1.entity.User;
import com.genpact.cabbooking1.cabbooking1.repository.userRepo;
import com.genpact.cabbooking1.cabbooking1.services.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private userRepo userRepositoy;

    @Override
    public User registerUser(User user) {
        return userRepositoy.save(user);
    }

    @Override
    public User updateUser(User user) {
        Long userId = user.getUserId();
        Optional<User> byId = userRepositoy.findById(userId);
        User user1 = byId.get();
        user1.setMail(user.getMail());
        user1.setPhoneNumber(user.getPhoneNumber());
        return userRepositoy.save(user1);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepositoy.findAll();
    }

    @Override
    public void deleteUser(Long userId) {
        userRepositoy.deleteById(userId);

    }
}
