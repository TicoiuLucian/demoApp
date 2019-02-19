package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Part;

@Repository
@Transactional
public interface PartRepository extends JpaRepository<Part, Long> {
	
}
