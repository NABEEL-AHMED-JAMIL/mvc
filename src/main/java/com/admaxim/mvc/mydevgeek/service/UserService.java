package com.admaxim.mvc.mydevgeek.service;


import com.admaxim.mvc.mydevgeek.domain.User;

/**
 * Created by DAM on 3/1/17.
 */
public interface UserService {

    User getUserById(Long id);

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);

}
