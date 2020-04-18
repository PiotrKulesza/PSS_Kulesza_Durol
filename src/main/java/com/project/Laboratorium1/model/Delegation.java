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
import javax.validation.constraints.NotNull;

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
	@JoinColumn( nullable=false)
	private User user;
	
	@Column(nullable = true)
	private String description;
	
	@Column(nullable = false)
	@NotNull
	private Timestamp dateTimeStart;
	
	@Column(nullable = false)
	@NotNull
	private Timestamp dateTimeStop;
	
	@Column(nullable = false)
	@NotNull
	private Double travelDietAmount = 30.0;
	
	@Column(nullable = false)
	@NotNull
	private Integer breakfastNumber = 0;
	
	@Column(nullable = false)
	@NotNull
	private Integer dinnerNumber = 0;
	
	@Column(nullable = false)
	@NotNull
	private Integer supperNumber = 0;
	
	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private TransportType transportType;
	
	@Column(nullable = true)
	private Double ticketPrice;

	@Column(nullable = false)
	@NotNull
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
