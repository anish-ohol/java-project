package com.lecom.vandistribution.vdservice.dto;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductDetailsDTO implements Serializable{

	private static final long serialVersionUID = 1984524214754589092L;

	private Integer productId;
	
	private String productCode;
	
	private String productName;
	
	private String hsnCode;
	
	private String productDesc;
	
	private Integer productCompanyId;
	
	private Integer productUnitId;
	
	private Integer productUnitQuantity;
	
	private Double productMrp;
	
	private Double productCgstPer;
	
	private Double productSgstPer;
	
	private ArrayList<Rate> productRate;
	
	private Boolean activeStatus;
	
	public Integer getProductId() {
		return productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public String getProductName() {
		return productName;
	}

	public String getHsnCode() {
		return hsnCode;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public Integer getProductCompanyId() {
		return productCompanyId;
	}

	public Integer getProductUnitId() {
		return productUnitId;
	}

	public Integer getProductUnitQuantity() {
		return productUnitQuantity;
	}

	public Double getProductMrp() {
		return productMrp;
	}

	public Double getProductCgstPer() {
		return productCgstPer;
	}

	public Double getProductSgstPer() {
		return productSgstPer;
	}

	public ArrayList<Rate> getProductRate() {
		return productRate;
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public void setProductCompanyId(Integer productCompanyId) {
		this.productCompanyId = productCompanyId;
	}

	public void setProductUnitId(Integer productUnitId) {
		this.productUnitId = productUnitId;
	}

	public void setProductUnitQuantity(Integer productUnitQuantity) {
		this.productUnitQuantity = productUnitQuantity;
	}

	public void setProductMrp(Double productMrp) {
		this.productMrp = productMrp;
	}

	public void setProductCgstPer(Double productCgstPer) {
		this.productCgstPer = productCgstPer;
	}

	public void setProductSgstPer(Double productSgstPer) {
		this.productSgstPer = productSgstPer;
	}

	public void setProductRate(ArrayList<Rate> productRate) {
		this.productRate = productRate;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
}