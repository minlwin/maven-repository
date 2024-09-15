package com.jdc.maven.domain.entity;

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

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Customer extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@OneToOne(optional = false)
	private Account account;

	private ContactInfo contact;

}
