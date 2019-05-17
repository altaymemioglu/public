package com.hotel.app.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hotel.app.data.CheckIn;

@RepositoryRestResource
public interface CheckInRepository extends JpaRepository<CheckIn, Long> {
	
	@Query("SELECT c FROM CheckIn c  WHERE c.employeeid=(:pEmployeeId)")
    List<CheckIn> findByEmployeeId(@Param("pEmployeeId") Long id);

}
