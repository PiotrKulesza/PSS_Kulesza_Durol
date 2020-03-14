package com.project.Laboratorium1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Laboratorium1.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	List<Role> findByRoleName(String roleName);
}
