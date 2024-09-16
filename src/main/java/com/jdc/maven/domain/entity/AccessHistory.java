package com.jdc.maven.domain.entity;

import com.jdc.maven.domain.embeddables.AccessHistoryPk;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class AccessHistory {

	@EmbeddedId
	private AccessHistoryPk id;
	
	private String ipAddress;
	private String deviceId;
	private String deviceToken;
	
	private System system;
	private Status status;
	
	public enum System {
		Admin, Cusmer, Agent
	}
	
	public enum Status {
		Success, PinError, OtpError
	}
}
