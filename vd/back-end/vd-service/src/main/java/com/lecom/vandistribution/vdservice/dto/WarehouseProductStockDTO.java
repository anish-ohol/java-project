package com.lecom.vandistribution.vdservice.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class WarehouseProductStockDTO implements Serializable{

	private static final long serialVersionUID = -101783813912734680L;

	private Integer skuId;
	
    private Integer wpsProductId;  

    private Integer wpsProductQuantity;
    
    private String rackNumber;
    	
	private Integer createdByEmpId;	
	
	private Integer updatedByEmpId;
    
	private Timestamp createdDateTime;
	
	private Timestamp updatedDateTime;
    
    private Boolean activeStatus;

	public Integer getSkuId() {
		return skuId;
	}

	public Integer getWpsProductId() {
		return wpsProductId;
	}

	public Integer getWpsProductQuantity() {
		return wpsProductQuantity;
	}

	public String getRackNumber() {
		return rackNumber;
	}

	public Integer getCreatedByEmpId() {
		return createdByEmpId;
	}

	public Integer getUpdatedByEmpId() {
		return updatedByEmpId;
	}

	public Timestamp getCreatedDateTime() {
		return createdDateTime;
	}

	public Timestamp getUpdatedDateTime() {
		return updatedDateTime;
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	public void setWpsProductId(Integer wpsProductId) {
		this.wpsProductId = wpsProductId;
	}

	public void setWpsProductQuantity(Integer wpsProductQuantity) {
		this.wpsProductQuantity = wpsProductQuantity;
	}

	public void setRackNumber(String rackNumber) {
		this.rackNumber = rackNumber;
	}

	public void setCreatedByEmpId(Integer createdByEmpId) {
		this.createdByEmpId = createdByEmpId;
	}

	public void setUpdatedByEmpId(Integer updatedByEmpId) {
		this.updatedByEmpId = updatedByEmpId;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public void setUpdatedDateTime(Timestamp updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
}