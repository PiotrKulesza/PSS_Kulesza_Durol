package com.project.Laboratorium1.model;


import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Delegation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long delegationId;
	
	@ManyToOne
	@JoinColumn(name="user_id", nullable=false)
	private User user;
	
	@Column(nullable = true)
	private String description;
	
	@Column(nullable = false)
	private Timestamp dateTimeStart;
	
	@Column(nullable = false)
	private Timestamp dateTimeStop;
	
	@Column(nullable = false)
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
