package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hotel.data.Adress;

@RepositoryRestResource
public interface AdressRepository extends JpaRepository<Adress, Long>{

}
