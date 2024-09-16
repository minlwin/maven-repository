package com.jdc.maven.domain.embeddables;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccessHistoryPk implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private LocalDateTime accessAt;
	private String username;
}
