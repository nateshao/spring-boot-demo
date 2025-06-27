package com.nateshao.orm.mybatis.mapper;

import com.nateshao.orm.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT id, name FROM user WHERE id = #{id}")
    User findById(Long id);
} 