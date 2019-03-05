package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByName(String username);

//	@Query("SELECT u FROM User u WHERE u.id = :id")
//	User findUserByUserStatusAndUserName(@Param("id") long id);

}
