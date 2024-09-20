package com.example.springboot.service;

import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.User;

import java.util.List;
import java.util.Objects;

public interface IUserService{
    List<User> list();

    Object page(UserPageRequest userPageRequest );

    void save(User user);

    User getById(Integer id);

    void updateById(User user);

    void update(User user);

    void deleteById(Integer id);
}
