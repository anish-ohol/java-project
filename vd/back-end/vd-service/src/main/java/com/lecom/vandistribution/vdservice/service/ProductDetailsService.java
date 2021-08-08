package com.lecom.vandistribution.vdservice.service;

import java.util.List;

import com.lecom.vandistribution.vdservice.dto.ProductDetailsDTO;

public interface ProductDetailsService {
	
	public List<ProductDetailsDTO> getProductDetails();
	public ProductDetailsDTO getProductDetails(Integer id);
	public ProductDetailsDTO updateProductDetails(Integer id,ProductDetailsDTO productDetailsDTO);
	public ProductDetailsDTO addProductDetails(ProductDetailsDTO productDetailsDTO);
	public Boolean removeProductDetails(Integer id);
}
