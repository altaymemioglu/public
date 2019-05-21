package com.hotel.app.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.app.data.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
