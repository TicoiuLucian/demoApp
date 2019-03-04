package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserOperationVehicle;

@Repository
public interface UserOperationVehicleRepository extends JpaRepository<UserOperationVehicle, Long> {

}
