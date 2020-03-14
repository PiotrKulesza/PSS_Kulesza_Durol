package com.project.Laboratorium1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Laboratorium1.model.Delegation;
import com.project.Laboratorium1.repositories.DelegationRepository;
import com.project.Laboratorium1.repositories.UserRepository;

@Service
public class DelegationService implements IDelegationService{

	@Autowired
	DelegationRepository delegationRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void save(long userId, Delegation delegation) {
		delegation.setUser(userRepository.findById(userId).get());
		delegationRepository.save(delegation);
	}

	@Override
	public void deleteById(long delegationId) {
		// TODO Auto-generated method stub
		delegationRepository.deleteById(delegationId);
	}

	@Override
	public void updateDelegation(long DelegationId, Delegation delegation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Delegation> findAll() {
		// TODO Auto-generated method stub
		return delegationRepository.findAll();
	}

	@Override
	public List<Delegation> findAllOrderByDateStartDesc() {
		// TODO Auto-generated method stub
		return delegationRepository.findAllOrderByDateTimeStartDesc();
	}

	@Override
	public List<Delegation> findByUserOrderByDateStartDesc() {
		// TODO Auto-generated method stub
		return delegationRepository.findByUserOrderByDateTimeStartDesc();
	}

}
