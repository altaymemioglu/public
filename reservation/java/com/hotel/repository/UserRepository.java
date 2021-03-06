package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.data.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
