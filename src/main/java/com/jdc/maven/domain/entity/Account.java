package com.jdc.maven.domain.entity;

import com.jdc.maven.domain.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Account extends BaseEntity{

	@Id
	private String username;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private Role role;
	
	public enum Role {
		Employee, Customer, Admin
	}
}
