package com.project.Laboratorium1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Laboratorium1.model.Delegation;
import com.project.Laboratorium1.model.User;
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
	public boolean deleteById(long delegationId) {
		// TODO Auto-generated method stub
		
		return delegationRepository.deleteByDelegationId(delegationId);
	}

	@Override
	public void updateDelegation(long DelegationId, Delegation delegation) {
		
		delegationRepository.updateDelegation(delegation.getDescription(),
				delegation.getDateTimeStart(), delegation.getDateTimeStop(),
				delegation.getTravelDietAmount(), delegation.getBreakfastNumber(),
				delegation.getDinnerNumber(), delegation.getSupperNumber(),
				delegation.getTransportType(), delegation.getTicketPrice(),
				delegation.getAutoCapacity(), delegation.getKm(),
				delegation.getAccomodationPrice(), delegation.getOtherTicketsPrice(),
				delegation.getOtherOutlayDesc(), delegation.getOtherOutlayPrice(), DelegationId);
		
	}

	@Override
	public List<Delegation> findAll() {
		// TODO Auto-generated method stub
		return delegationRepository.findAll();
	}

	@Override
	public List<Delegation> findAllOrderByDateStartDesc() {
		// TODO Auto-generated method stub
		return delegationRepository.findAllByOrderByDateTimeStartDesc();
	}

	@Override
	public List<Delegation> findByUserOrderByDateStartDesc(Long userId) {
		// TODO Auto-generated method stub
		return delegationRepository.findDelegationByUser_UserIdByOrderByDateTimeStartDesc(userId);
	}


	@Override
	public boolean deleteByUser(long userId) {
		// TODO Auto-generated method stub
		return delegationRepository.deleteByUser_UserId(userId);
	}

}
