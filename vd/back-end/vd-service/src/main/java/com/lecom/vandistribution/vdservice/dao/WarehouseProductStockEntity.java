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
@Table(name="warehouse_product_stock")
public class WarehouseProductStockEntity implements Serializable{

	private static final long serialVersionUID = -9097112484283365319L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "warehouse_product_stock_sku_id")
	@SequenceGenerator(name = "warehouse_product_stock_sku_id", sequenceName = "warehouse_product_stock_sku_id_seq", allocationSize = 1)
	@Column(name = "sku_id")
	private Integer skuId;
	
	@ManyToOne
	private ProductDetailsEntity productDetailsEntity;
	@Column(name = "wpe_product_id" , updatable=true, insertable=true)
    private Integer wpsProductId;  

    @Column(name = "wps_product_quantity")
    private Integer wpsProductQuantity;
    
    @Column(name = "rack_number")
    private String rackNumber;
    
	@ManyToOne
	private EmployeeEntity employeeEntity;
	@Column(name = "created_by_emp_id" , updatable=true, insertable=true)	
	private Integer createdByEmpId;	
	@Column(name = "updated_by_emp_id" , updatable=true, insertable=true)
	private Integer updatedByEmpId;
    
    @Column(name="created_date_time")
	private Timestamp createdDateTime;
	
	@Column(name="updated_date_time")
	private Timestamp updatedDateTime;
    
    @Column(name = "active_status")
    private Boolean activeStatus;
    
	public Integer getSkuId() {
		return skuId;
	}

	public ProductDetailsEntity getProductDetailsEntity() {
		return productDetailsEntity;
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

	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
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

	public void setProductDetailsEntity(ProductDetailsEntity productDetailsEntity) {
		this.productDetailsEntity = productDetailsEntity;
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

	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
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
