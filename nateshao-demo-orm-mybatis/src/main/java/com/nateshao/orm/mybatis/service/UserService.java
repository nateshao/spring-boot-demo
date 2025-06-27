package com.nateshao.orm.mybatis.service;

import com.nateshao.orm.mybatis.entity.User;
import com.nateshao.orm.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findById(Long id) {
        return userMapper.findById(id);
    }
} 