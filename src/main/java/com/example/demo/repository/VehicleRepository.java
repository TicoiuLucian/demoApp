package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Vehicle;

@Repository
@Transactional
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
