package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Part;

@Repository
@Transactional
public interface PartRepository extends JpaRepository<Part, Long> {
	
	@Query("SELECT p FROM Part p WHERE LOWER(p.name) = LOWER(:name)")
	List<Part> findByName(@Param("name") String name);
	
	
}
