package com.lecom.vandistribution.vdservice.dao;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.lecom.vandistribution.vdservice.dto.Rate;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name = "product_details")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class ProductDetailsEntity implements Serializable {

	private static final long serialVersionUID = -7913334450231959590L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_details_product_id")
	@SequenceGenerator(name = "product_details_product_id", sequenceName = "product_details_product_id_seq", allocationSize = 1)
	@Column(name = "product_id")
	private Integer productId;

	@Column(name = "product_code")
	private String productCode;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "hsn_code")
	private String hsnCode;

	@Column(name = "product_desc")
	private String productDesc;

	@ManyToOne
	private AppConfigEntity appConfigEntity;
	@Column(name = "prod_company_id", updatable = true, insertable = true)
	private Integer productCompanyId;
	@Column(name = "prod_unit_id", updatable = true, insertable = true)
	private Integer productUnitId;

	@Column(name = "prod_unit_quantity")
	private Integer productUnitQuantity;

	@Column(name = "product_mrp")
	private Double productMrp;

	@Column(name = "prod_cgst_per")
	private Double productCgstPer;

	@Column(name = "prod_sgst_per")
	private Double productSgstPer;

	/*
	 * { product_rate : [ { key:"rate1", value:120.0 }, { key:"rate2", value:121.0
	 * }, { key:"rate3", value:122.0 }, { key:"rate4", value:123.0 }, { key:"rate5",
	 * value:124.0 } ] }
	 */

	@Type(type = "jsonb")
	@Column(name = "product_rate" , columnDefinition = "json")
	private ArrayList<Rate> productRate;

	@Column(name = "active_status")
	private Boolean activeStatus;

	@Column(name = "created_date_time")
	private Timestamp created_date_time;

	@Column(name = "updated_date_time")
	private Timestamp updated_date_time;

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

	public Timestamp getCreated_date_time() {
		return created_date_time;
	}

	public Timestamp getUpdated_date_time() {
		return updated_date_time;
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

	public void setCreated_date_time(Timestamp created_date_time) {
		this.created_date_time = created_date_time;
	}

	public void setUpdated_date_time(Timestamp updated_date_time) {
		this.updated_date_time = updated_date_time;
	}

}
