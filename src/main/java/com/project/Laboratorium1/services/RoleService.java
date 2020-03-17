package com.project.Laboratorium1.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.Laboratorium1.model.Role;
import com.project.Laboratorium1.repositories.RoleRepository;

public class RoleService implements IRoleService {
	
	@Autowired
	RoleRepository roleRepository;

	@Override
	public Set<Role> findByRoleName(String roleName) {
		// TODO Auto-generated method stub
		return roleRepository.findByRoleName(roleName);
	}

}
