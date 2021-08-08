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
@Table(name = "warehouse_details")
public class WarehouseDetailsEntity implements Serializable{

	private static final long serialVersionUID = -2710389100496316655L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "warehouse_details_warehouse_id")
	@SequenceGenerator(name = "warehouse_details_warehouse_id", sequenceName = "warehouse_details_warehouse_id_seq", allocationSize = 1)
	@Column(name = "warehouse_id")
	private Integer warehouseId;

	@Column(name = "warehouse_name")
	private String warehouseName;

	@Column(name = "warehouse_address")
	private String warehouseAddress;

	@Column(name = "warehouse_contact")
	private String warehouseContact;

	@Column(name = "active_status")
	private Boolean activeStatus;
	
	@Column(name="created_date_time")
	private Timestamp created_date_time;
	
	@Column(name="updated_date_time")
	private Timestamp updated_date_time;

	public Integer getWarehouseId() {
		return warehouseId;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public String getWarehouseAddress() {
		return warehouseAddress;
	}

	public String getWarehouseContact() {
		return warehouseContact;
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

	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public void setWarehouseAddress(String warehouseAddress) {
		this.warehouseAddress = warehouseAddress;
	}

	public void setWarehouseContact(String warehouseContact) {
		this.warehouseContact = warehouseContact;
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
