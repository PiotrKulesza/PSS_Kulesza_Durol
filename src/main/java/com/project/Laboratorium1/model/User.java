package com.project.Laboratorium1.model;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;

	@ManyToMany
	private Set<Role> role;

	@Column(name = "companyName", nullable = false)
	private String companyName;

	@Column(name = "companyAddress", nullable = false)
	private String companyAddress;

	@Column(name = "companyNip", nullable = false)
	private String companyNip;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "lastName", nullable = false)
	private String lastName;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "status", nullable = false)
	private Boolean status;

	@Column(name = "registrationDate", nullable = false)
	private Timestamp registrationDate;

	@OneToMany
    private Set<Delegation> delegations;
	
}
