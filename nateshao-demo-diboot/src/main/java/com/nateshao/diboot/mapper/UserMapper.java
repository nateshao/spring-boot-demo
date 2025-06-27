package com.nateshao.diboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nateshao.diboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
} 