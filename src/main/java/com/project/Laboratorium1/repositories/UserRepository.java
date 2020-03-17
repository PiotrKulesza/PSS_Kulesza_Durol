package com.project.Laboratorium1.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.Laboratorium1.model.Role;
import com.project.Laboratorium1.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Modifying
	@Query("update User u set u.password = ?1 where u.userId = ?2")
	void setUserPasswordByUser_id(String newPassword, Long user_id);
	
	List<User> findByRole_RoleName(String roleName);
	
	boolean deleteByUserId(Long user_id);
	
	
}
