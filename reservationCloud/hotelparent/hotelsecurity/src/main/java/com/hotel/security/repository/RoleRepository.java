package com.hotel.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.data.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
