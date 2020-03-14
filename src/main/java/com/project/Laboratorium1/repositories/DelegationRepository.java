package com.project.Laboratorium1.repositories;

import java.security.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.Laboratorium1.model.Delegation;
import com.project.Laboratorium1.model.TransportType;

@Repository
public interface DelegationRepository extends JpaRepository<Delegation, Long> {

	List<Delegation> findByUserOrderByDateTimeStartDesc();
	List<Delegation> findAllOrderByDateTimeStartDesc();
	@Modifying
	@Query("update delegation d set d.description = ?1, d.date_time_start = ?2, "
			+ "d.date_time_start = ?3, d.travel_diet_amount = ?4, d.breakfast_number = ?5, "
			+ "d.dinner_number = ?6, d.supper_number = ?7, d.transport_type = ?8, "
			+ "d.ticket_price = ?9, d.auto_capacity = ?10, d.km = ?11, d.accomodation_price = ?12, "
			+ "d.other_tickets_price = ?13, d.other_outlay_desc = ?14, d.other_outlay_price = ?15 where d.user_id = ?16")
	void setUserById(String description,Timestamp dateTimeStart,Timestamp dateTimeStop,Double travelDietAmount,
			Integer breakfastNumber,Integer dinnerNumber,Integer supperNumber,TransportType transportType,
			Double ticketPrice,Boolean autoCapacity,Long km,Double accomodationPrice,
			Double otherTicketsPrice,Double otherOutlayDesc,Double otherOutlayPrice, long DelegationId);
}
