package com.project.Laboratorium1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.Laboratorium1.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Modifying
	@Query("update user u set u.password = ?1 where u.user_id = ?2")
	void setUserPasswordById(String description, Long userId);
	
}
