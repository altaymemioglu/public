package com.hotel.app.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.app.data.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
