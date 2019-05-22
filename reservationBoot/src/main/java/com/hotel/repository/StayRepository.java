package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hotel.data.Stay;

@RepositoryRestResource
public interface StayRepository extends JpaRepository<Stay, Long> {

}
