package com.lecom.vandistribution.vdservice.dao;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity implements Serializable{

	private static final long serialVersionUID = 547076455529602278L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_emp_id")
	@SequenceGenerator(name = "employee_emp_id", sequenceName = "employee_emp_id_seq", allocationSize = 1)
	@Column(name = "emp_id")
	private Integer empId;

	@Column(name = "emp_name")
	private String empName;

	@Column(name = "emp_contact")
	private String empContact;

	@Column(name = "emp_address")
	private String empAddress;

	@ManyToOne
	private AppConfigEntity appConfigEntity;
	@Column(name = "designation_id" , updatable=true, insertable=true)
	private Integer designationId;	
	@Column(name = "id_proof_type" , updatable=true, insertable=true)
	private Integer idProofType;
	
	@ManyToOne
	private WarehouseDetailsEntity warehouseDetailsEntity;
	@Column(name = "emp_warehouse_id" , updatable=true, insertable=true)
	private Integer empWarehouseId;

	@Column(name = "id_proof_details")
	private String idProofDetails;

	@Column(name = "emp_dob")
	private Date empDob;

	@Column(name = "active_status")
	private Boolean activeStatus;
	
	@Column(name="created_date_time")
	private Timestamp created_date_time;
	
	@Column(name="updated_date_time")
	private Timestamp updated_date_time;

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

	public Date getEmpDob() {
		return empDob;
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

	public void setEmpDob(LocalDate empDob) {
		this.empDob = Date.valueOf(empDob);
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
