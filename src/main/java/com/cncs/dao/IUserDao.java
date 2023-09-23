package com.cncs.dao;

import com.cncs.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll() throws Exception;
}
