package com.cbd.clicker.interfaces;

import com.cbd.clicker.entities.User;

public interface UserService {
    User findByUserName(String name);

    void saveUser(User user);
}
