package com.lecom.vandistribution.vdservice.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class WarehouseProductEntryDTO implements Serializable{

	private static final long serialVersionUID = -2207173115541305950L;

	private Integer wpeId;
	
	private Integer wpeWarehouseId;
	
	private Integer wpeProductId;
	
	private Integer wpeProductQuantity;	
	
	private Integer createdByEmpId;
	
	private Integer updatedByEmpId;
	
	private Integer entryStatus;
	
	private Timestamp createdDateTime;
	
	private Timestamp updatedDateTime;

	public Integer getWpeId() {
		return wpeId;
	}

	public Integer getWpeWarehouseId() {
		return wpeWarehouseId;
	}

	public Integer getWpeProductId() {
		return wpeProductId;
	}

	public Integer getWpeProductQuantity() {
		return wpeProductQuantity;
	}

	public Integer getCreatedByEmpId() {
		return createdByEmpId;
	}

	public Integer getUpdatedByEmpId() {
		return updatedByEmpId;
	}


	public Integer getEntryStatus() {
		return entryStatus;
	}

	public Timestamp getCreatedDateTime() {
		return createdDateTime;
	}

	public Timestamp getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setWpeId(Integer wpeId) {
		this.wpeId = wpeId;
	}

	public void setWpeWarehouseId(Integer wpeWarehouseId) {
		this.wpeWarehouseId = wpeWarehouseId;
	}

	public void setWpeProductId(Integer wpeProductId) {
		this.wpeProductId = wpeProductId;
	}

	public void setWpeProductQuantity(Integer wpeProductQuantity) {
		this.wpeProductQuantity = wpeProductQuantity;
	}

	public void setCreatedByEmpId(Integer createdByEmpId) {
		this.createdByEmpId = createdByEmpId;
	}

	public void setUpdatedByEmpId(Integer updatedByEmpId) {
		this.updatedByEmpId = updatedByEmpId;
	}

	public void setEntryStatus(Integer entryStatus) {
		this.entryStatus = entryStatus;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public void setUpdatedDateTime(Timestamp updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}
}