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
@Table(name="van_details")
public class VanDetailsEntity implements Serializable{	

	private static final long serialVersionUID = 3289322870860544120L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "van_details_van_id")
	@SequenceGenerator(name = "van_details_van_id", sequenceName = "van_details_van_id_seq", allocationSize = 1)
	@Column(name = "van_id")
	private Integer vanId;

	@Column(name = "van_number")
	private String vanNumber;

	@Column(name = "van_name")
	private String vanName;

	@Column(name = "active_status")
	private Boolean activeStatus;
	
	@Column(name = "created_date_time")
	private Timestamp created_date_time;

	@Column(name = "updated_date_time")
	private Timestamp updated_date_time;

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

	public Timestamp getCreated_date_time() {
		return created_date_time;
	}

	public Timestamp getUpdated_date_time() {
		return updated_date_time;
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

	public void setCreated_date_time(Timestamp created_date_time) {
		this.created_date_time = created_date_time;
	}

	public void setUpdated_date_time(Timestamp updated_date_time) {
		this.updated_date_time = updated_date_time;
	}

}
