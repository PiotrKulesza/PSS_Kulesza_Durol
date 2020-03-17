package com.project.Laboratorium1.services;

import java.util.Set;

import com.project.Laboratorium1.model.Role;

public interface IRoleService {
	Set<Role> findByRoleName(String roleName);
}
