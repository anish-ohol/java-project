package com.lecom.vandistribution.vdservice.dto;

import java.io.Serializable;

public class AppConfigDTO implements Serializable{

	private static final long serialVersionUID = 3568819577463316289L;
		
	private Integer propertyId;	

	private String propertyType;	

	private String propertyValue;
	
	private Boolean activeStatus;

	public Integer getPropertyId() {
		return propertyId;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public String getPropertyValue() {
		return propertyValue;
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
}