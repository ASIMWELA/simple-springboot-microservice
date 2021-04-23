package com.hopelesscoder.UserService.repository;

import com.hopelesscoder.UserService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUserId(Long userId);
}
