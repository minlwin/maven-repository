package com.jdc.maven.domain.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import com.jdc.maven.domain.BaseEntity;
import com.jdc.maven.domain.embeddables.ContactInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Employee Entity
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Employee extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@OneToOne(optional = false)
	private Account account;
	
	private LocalDateTime assignAt;
	private LocalDateTime resignAt;
	
	private ContactInfo contact;
}
