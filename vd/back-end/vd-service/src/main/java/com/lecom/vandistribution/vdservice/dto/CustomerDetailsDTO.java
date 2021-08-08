package com.lecom.vandistribution.vdservice.dto;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CustomerDetailsDTO implements Serializable{

	private static final long serialVersionUID = 8647275065869219436L;

	private Integer custId;

	private String custName;

	private String shopName;

	private String custContact;

	private String custGstNo;

	private String custAddress;

	private Double outstanding;

	@JsonFormat(pattern="yyyy-MM-dd")
	private Date custDob;

	private Boolean activeStatus;	
	

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

	public LocalDate getCustDob() {
		return custDob.toLocalDate();
	}

	public Boolean getActiveStatus() {
		return activeStatus;
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

	public void setCustDob(Date custDob) {
		this.custDob = custDob;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
}
