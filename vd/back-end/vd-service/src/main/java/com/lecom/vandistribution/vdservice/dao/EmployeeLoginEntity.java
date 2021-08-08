package com.lecom.vandistribution.vdservice.dao;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class EmployeeLoginEntity implements Serializable{
	
	private static final long serialVersionUID = -2835602426672131766L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_login_emp_login_id")
	@SequenceGenerator(name = "emp_login_emp_login_id", sequenceName = "emp_login_emp_login_id_seq", allocationSize = 1)
	@Column(name="emp_login_id")
	private Integer employeeLoginId;

	@Column(name="login_details_emp_id")
	private EmployeeEntity loginDetailsEmployeeId;

	@Column(name="emp_username")
	private String employeeUserName;

	@Column(name="emp_password")
	private String employeePassword;	
	
	@Column(name="created_date_time")
	private Timestamp created_date_time;
	
	@Column(name="updated_date_time")
	private Timestamp updated_date_time;	

	@Column(name="active_status")
	private Boolean activeStatus;
	
	@Column(name="valid_up_to")
	private Timestamp validUpTO;

	public Timestamp getValidUpTO() {
		return validUpTO;
	}

	public void setValidUpTO(Timestamp validUpTO) {		
		Long valid=Long.valueOf(this.updated_date_time.getTime()) + Long.valueOf(60 * 24 * 60 * 60 * 1000);
		this.validUpTO = new Timestamp(valid);
	}

	public Integer getEmployeeLoginId() {
		return employeeLoginId;
	}

	public EmployeeEntity getLoginDetailsEmployeeId() {
		return loginDetailsEmployeeId;
	}

	public String getEmployeeUserName() {
		return employeeUserName;
	}

	public Timestamp getCreated_date_time() {
		return created_date_time;
	}

	public Timestamp getUpdated_date_time() {
		return updated_date_time;
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setEmployeeLoginId(Integer employeeLoginId) {
		this.employeeLoginId = employeeLoginId;
	}

	public void setLoginDetailsEmployeeId(EmployeeEntity loginDetailsEmployeeId) {
		this.loginDetailsEmployeeId = loginDetailsEmployeeId;
	}

	public void setEmployeeUserName(String employeeUserName) {
		this.employeeUserName = employeeUserName;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	public void setCreated_date_time(Timestamp created_date_time) {
		this.created_date_time = created_date_time;
	}

	public void setUpdated_date_time(Timestamp updated_date_time) {
		this.updated_date_time = updated_date_time;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
	

}
