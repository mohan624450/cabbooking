package com.genpact.cabbooking1.cabbooking1.services;

import com.genpact.cabbooking1.cabbooking1.entity.User;

import java.util.List;

public interface UserService {

    User registerUser(User user);
    User updateUser(User user);

    List<User> getAllUsers();

    void deleteUser(Long userId);

}
