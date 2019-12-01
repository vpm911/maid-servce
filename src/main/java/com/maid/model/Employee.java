package com.maid.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	User user;

	@ManyToMany
	@JoinTable(name = "employee_service",joinColumns = @JoinColumn(name="employee_id"),inverseJoinColumns = @JoinColumn(name="ref_sub_service_id") )
	Set<RefSubService> subServices;
}
