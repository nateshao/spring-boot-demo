package com.nateshao.orm.jpa.repository;

import com.nateshao.orm.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
} 