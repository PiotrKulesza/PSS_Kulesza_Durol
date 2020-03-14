package com.project.Laboratorium1.services;

import java.util.List;

import com.project.Laboratorium1.model.Delegation;

public interface IDelegationService {
	
	void save(long userId, Delegation delegation);
	void deleteById(long delegationId);
	void updateDelegation(long DelegationId, Delegation delegation);
	List<Delegation> findAll();
	List<Delegation> findAllOrderByDateStartDesc();
	List<Delegation> findByUserOrderByDateStartDesc();
	
}
