
package com.lecom.vandistribution.vdservice.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class ShipmentDTO implements Serializable{

	private static final long serialVersionUID = 7693757488634638505L;

	private Integer shipId;
	
	private Timestamp shipDateTime;

	private Integer shipVanId;

	private Integer shipEmployeeId;

	private Integer shipWarehouseId;

	private Integer shipStatus;		

	public Integer getShipId() {
		return shipId;
	}

	public Timestamp getShipDateTime() {
		return shipDateTime;
	}

	public Integer getShipVanId() {
		return shipVanId;
	}

	public Integer getShipEmployeeId() {
		return shipEmployeeId;
	}

	public Integer getShipWarehouseId() {
		return shipWarehouseId;
	}

	public Integer getShipStatus() {
		return shipStatus;
	}

	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}

	public void setShipDateTime(Timestamp shipDateTime) {
		this.shipDateTime = shipDateTime;
	}

	public void setShipVanId(Integer shipVanId) {
		this.shipVanId = shipVanId;
	}

	public void setShipEmployeeId(Integer shipEmployeeId) {
		this.shipEmployeeId = shipEmployeeId;
	}

	public void setShipWarehouseId(Integer shipWarehouseId) {
		this.shipWarehouseId = shipWarehouseId;
	}

	public void setShipStatus(Integer shipStatus) {
		this.shipStatus = shipStatus;
	}
}