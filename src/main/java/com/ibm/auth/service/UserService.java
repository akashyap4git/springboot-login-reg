package com.ibm.auth.service;

import com.ibm.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
