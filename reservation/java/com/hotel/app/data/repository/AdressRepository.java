package com.hotel.app.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hotel.app.data.Adress;

@RepositoryRestResource
public interface AdressRepository extends JpaRepository<Adress, Long>{

}
