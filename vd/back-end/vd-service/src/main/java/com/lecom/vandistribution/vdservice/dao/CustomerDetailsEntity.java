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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="customer_details")
public class CustomerDetailsEntity implements Serializable{

	private static final long serialVersionUID = 7138193577194748420L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_details_cust_id")
	@SequenceGenerator(name = "customer_details_cust_id", sequenceName = "customer_details_cust_id_seq", allocationSize = 1)
	@Column(name="cust_id")
	private Integer custId;

	@Column(name="cust_name")
	private String custName;

	@Column(name="shop_name")
	private String shopName;

	@Column(name="cust_contact")
	private String custContact;

	@Column(name="cust_gst_no")
	private String custGstNo;

	@Column(name="cust_address")
	private String custAddress;

	@Column(name="outstanding")
	private Double outstanding;

	@Column(name="cust_dob")
	private Date custDob;

	@Column(name="active_status")
	private Boolean activeStatus;
	
	@Column(name="created_date_time")
	private Timestamp created_date_time;
	
	@Column(name="updated_date_time")
	private Timestamp updated_date_time;

	public Integer getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public String getShopName() {
		return shopName;
	}

	public String getCustContact() {
		return custContact;
	}

	public String getCustGstNo() {
		return custGstNo;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public Double getOutstanding() {
		return outstanding;
	}

	public Date getCustDob() {
		return custDob;
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

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public void setCustContact(String custContact) {
		this.custContact = custContact;
	}

	public void setCustGstNo(String custGstNo) {
		this.custGstNo = custGstNo;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public void setOutstanding(Double outstanding) {
		this.outstanding = outstanding;
	}

	public void setCustDob(LocalDate custDob) {		
		this.custDob = Date.valueOf(custDob);
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
