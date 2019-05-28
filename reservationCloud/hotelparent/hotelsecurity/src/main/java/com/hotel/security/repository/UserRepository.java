package com.hotel.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.security.data.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
