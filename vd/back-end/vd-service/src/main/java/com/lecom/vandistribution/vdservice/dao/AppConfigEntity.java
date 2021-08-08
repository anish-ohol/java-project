package com.lecom.vandistribution.vdservice.dao;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="app_config")
public class AppConfigEntity implements Serializable{

	private static final long serialVersionUID = -5959937769112931996L;

	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE ,  generator = "app_config_id")
	@SequenceGenerator(name="app_config_id",sequenceName = "app_config_property_id_seq" , allocationSize = 1)
	@Column(name="property_id")
	private Integer propertyId;	

	@Column(name="property_type")
	private String propertyType;	

	@Column(name="property_value")
	private String propertyValue;
	
	@Column(name="active_status")
	private Boolean activeStatus;
	
	@Column(name="created_date_time")
	private Timestamp created_date_time;
	
	@Column(name="updated_date_time")
	private Timestamp updated_date_time;
	
	
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

	public Timestamp getCreated_date_time() {
		return created_date_time;
	}

	public Timestamp getUpdated_date_time() {
		return updated_date_time;
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
	
	public void setCreated_date_time(Timestamp created_date_time) {
		this.created_date_time = created_date_time;
	}

	public void setUpdated_date_time(Timestamp updated_date_time) {
		this.updated_date_time = updated_date_time;
	}

	
}
