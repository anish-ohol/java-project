package com.lecom.vandistribution.vdservice.dto;

import java.io.Serializable;

public class VanDetailsDTO implements Serializable {

	private static final long serialVersionUID = 1819470840921058476L;

	private Integer vanId;

	private String vanNumber;

	private String vanName;

	private Boolean activeStatus;

	public Integer getVanId() {
		return vanId;
	}

	public String getVanNumber() {
		return vanNumber;
	}

	public String getVanName() {
		return vanName;
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setVanId(Integer vanId) {
		this.vanId = vanId;
	}

	public void setVanNumber(String vanNumber) {
		this.vanNumber = vanNumber;
	}

	public void setVanName(String vanName) {
		this.vanName = vanName;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
}
