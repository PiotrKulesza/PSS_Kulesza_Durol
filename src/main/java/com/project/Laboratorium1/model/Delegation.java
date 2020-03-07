package com.project.Laboratorium1.model;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Delegation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long delegation_id;
	
	@ManyToOne
	private User user;
	
	@Column(name = "description",nullable = true)
	private String description;
	
	@Column(name = "dateTimeStart",nullable = false)
	private Timestamp dateTimeStart;
	
	@Column(name = "dateTimeStop",nullable = false)
	private Timestamp dateTimeStop;
	
	@Column(name = "travelDietAmount",nullable = false)
	private Double travelDietAmount;
	
	@Column(nullable = false)
	private Integer breakfastNumber;
	
	@Column(nullable = false)
	private Integer dinnerNumber;
	
	@Column(nullable = false)
	private Integer supperNumber;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TransportType transportType;
	
	@Column(nullable = true)
	private Double ticketPrice;
	
	private Boolean autoCapacity;
	
	@Column(nullable = true)
	private Long km;
	
	@Column(nullable = true)
	private Double accomodationPrice;
	@Column(nullable = true)
	private Double otherTicketsPrice;
	@Column(nullable = true)
	private Double otherOutlayDesc;
	@Column(nullable = true)
	private Double otherOutlayPrice;
	
	
	
}
