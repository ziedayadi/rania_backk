package com.auth.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.entitie.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	boolean existsByUsername(String username);

	  User findByUsername(String username);

	  @Transactional
	  void deleteByUsername(String username);

}
