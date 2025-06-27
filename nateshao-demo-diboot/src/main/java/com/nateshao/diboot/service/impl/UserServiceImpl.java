package com.nateshao.diboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nateshao.diboot.entity.User;
import com.nateshao.diboot.mapper.UserMapper;
import com.nateshao.diboot.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
} 