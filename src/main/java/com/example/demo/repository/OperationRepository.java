package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {

}
