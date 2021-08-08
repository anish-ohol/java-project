package com.lecom.vandistribution.vdservice.dto;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmployeeDTO implements Serializable{
	
	private static final long serialVersionUID = 4659147950122956811L;

	private Integer empId;

	private String empName;

	private String empContact;

	private String empAddress;

	private Integer designationId;

	private Integer empWarehouseId;

	private Integer idProofType;

	private String idProofDetails;

	@JsonFormat(pattern="yyyy-MM-dd")
	private Date empDob;

	private Boolean activeStatus;
	

	public Integer getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpContact() {
		return empContact;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public Integer getDesignationId() {
		return designationId;
	}

	public Integer getEmpWarehouseId() {
		return empWarehouseId;
	}

	public Integer getIdProofType() {
		return idProofType;
	}

	public String getIdProofDetails() {
		return idProofDetails;
	}

	public LocalDate getEmpDob() {
		return empDob.toLocalDate();
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public void setDesignationId(Integer designationId) {
		this.designationId = designationId;
	}

	public void setEmpWarehouseId(Integer empWarehouseId) {
		this.empWarehouseId = empWarehouseId;
	}

	public void setIdProofType(Integer idProofType) {
		this.idProofType = idProofType;
	}

	public void setIdProofDetails(String idProofDetails) {
		this.idProofDetails = idProofDetails;
	}

	public void setEmpDob(Date empDob) {
		this.empDob = empDob;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
}