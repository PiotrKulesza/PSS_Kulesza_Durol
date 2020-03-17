package com.project.Laboratorium1.model;

import javax.persistence.*;

import lombok.Data;



@Entity
@Table(name = "role")
@Data
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long roleId;
	
	
	@Column(name = "roleName",nullable = false)
	private String roleName;
	
}
