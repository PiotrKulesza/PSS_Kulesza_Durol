package com.project.Laboratorium1.services;

import java.util.List;

import com.project.Laboratorium1.model.User;

public interface IUserService {
	void save(User user);
	List<User> findAll() ;
	void updatePassword(long userId, String newPassword);
	void deleteById(long userId);
}
