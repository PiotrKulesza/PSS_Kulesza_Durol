package com.project.Laboratorium1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.project.Laboratorium1.services.IDelegationService;
import com.project.Laboratorium1.services.IUserService;

@Controller
public class JDBCController {
	@Autowired
	private IDelegationService delegationService;
	@Autowired
	private IUserService userService;
	
	
	
}
