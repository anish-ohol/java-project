package com.lecom.vandistribution.vdservice.dto;

import java.io.Serializable;

public class WarehouseDetailsDTO implements Serializable{

	private static final long serialVersionUID = 7710628578382356537L;

	private Integer warehouseId;

	private String warehouseName;

	private String warehouseAddress;

	private String warehouseContact;

	private Boolean activeStatus;

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
}