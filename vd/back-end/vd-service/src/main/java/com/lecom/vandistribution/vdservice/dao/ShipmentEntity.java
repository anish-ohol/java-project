package com.lecom.vandistribution.vdservice.dao;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="shipment")
public class ShipmentEntity implements Serializable {

	private static final long serialVersionUID = -8016172161640817669L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shipment_ship_id")
	@SequenceGenerator(name = "shipment_ship_id", sequenceName = "shipment_ship_id_seq", allocationSize = 1)
	@Column(name = "ship_id")
	private Integer shipId;

	@Column(name = "ship_date_time")
	private Timestamp shipDateTime;

	@ManyToOne
	private VanDetailsEntity vanDetailsEntity;
	@Column(name = "vanId", updatable = true, insertable = true)
	private Integer shipVanId;

	@ManyToOne
	private EmployeeEntity employeeEntity;
	@Column(name = "ship_emp_id", updatable = true, insertable = true)
	private Integer shipEmpId;

	@ManyToOne
	private WarehouseDetailsEntity warehouseDetailsEntity;
	@Column(name = "ship_warehouse_id", updatable = true, insertable = true)
	private Integer shipWarehouseId;

	@ManyToOne
	private AppConfigEntity appConfigEntity;
	@Column(name = "ship_status", updatable = true, insertable = true)
	private Integer shipStatus;

	@Column(name = "created_date_time")
	private Timestamp createdDateTime;

	@Column(name = "updated_date_time")
	private Timestamp updatedDateTime;

	public Integer getShipId() {
		return shipId;
	}

	public Timestamp getShipDateTime() {
		return shipDateTime;
	}


	public Integer getShipVanId() {
		return shipVanId;
	}


	public Integer getShipEmpId() {
		return shipEmpId;
	}


	public Integer getShipWarehouseId() {
		return shipWarehouseId;
	}


	public Integer getShipStatus() {
		return shipStatus;
	}

	public Timestamp getCreatedDateTime() {
		return createdDateTime;
	}

	public Timestamp getUpdatedDateTime() {
		return updatedDateTime;
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

	public void setShipEmpId(Integer shipEmpId) {
		this.shipEmpId = shipEmpId;
	}


	public void setShipWarehouseId(Integer shipWarehouseId) {
		this.shipWarehouseId = shipWarehouseId;
	}

	public void setShipStatus(Integer shipStatus) {
		this.shipStatus = shipStatus;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public void setUpdatedDateTime(Timestamp updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}
}
