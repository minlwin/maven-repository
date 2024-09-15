package com.jdc.maven.domain.embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class ContactInfo {

	@Column(nullable = false)
	private String phone;
	@Column(nullable = false)
	private String email;
	private String address;
}
