package com.project.Laboratorium1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Laboratorium1.model.User;
import com.project.Laboratorium1.repositories.RoleRepository;
import com.project.Laboratorium1.repositories.UserRepository;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void updatePassword(long userId, String newPassword) {
		userRepository.setUserPasswordByUser_id(newPassword, userId);
		
	}

	@Override
	public boolean deleteById(long user_id) {
		return userRepository.deleteByUserId(user_id);
	}

	@Override
	public List<User> getAllUsersByRoleName(String roleName) {
		// TODO Auto-generated method stub
		return userRepository.findByRole_RoleName(roleName);
	}
	
	
	
}
