package com.lecom.vandistribution.vdservice.dto;

import java.io.Serializable;

public class Rate  implements Serializable {
	
	private static final long serialVersionUID = 949765307607142528L;	
	
	private String key;
	private Double value;
	
	public String getKey() {
		return key;
	}
	public Double getValue() {
		return value;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public void setValue(Double value) {
		this.value = value;
	}
}