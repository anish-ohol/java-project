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
@Table(name="warehouse_product_entry")
public class WarehouseProductEntryEntity implements Serializable{

	private static final long serialVersionUID = 3422882767306227119L;	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "warehouse_product_entry_wpe_id")
	@SequenceGenerator(name = "warehouse_product_entry_wpe_id", sequenceName = "warehouse_product_entry_wpe_id_seq", allocationSize = 1)
	@Column(name = "wpe_id")
	private Integer wpeId;
	
	@ManyToOne
	private WarehouseDetailsEntity warehouseDetailsEntity;
	@Column(name = "wpe_warehouse_id" , updatable=true, insertable=true)
	private Integer wpeWarehouseId;
	
	@ManyToOne
	private ProductDetailsEntity productDetailsEntity;
	@Column(name = "wpe_product_id" , updatable=true, insertable=true)
	private Integer wpeProductId;
	
	@Column(name = "wpe_product_quantity")
	private Integer wpeProductQuantity;

	@ManyToOne
	private EmployeeEntity employeeEntity;
	@Column(name = "created_by_emp_id" , updatable=true, insertable=true)	
	private Integer createdByEmpId;	
	@Column(name = "updated_by_emp_id" , updatable=true, insertable=true)
	private Integer updatedByEmpId;
	
	@ManyToOne
	private AppConfigEntity appConfigEntity;
	@Column(name = "entry_status" , updatable=true, insertable=true)
	private Integer entryStatus;
	
	@Column(name="created_date_time")
	private Timestamp createdDateTime;
	
	@Column(name="updated_date_time")
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
