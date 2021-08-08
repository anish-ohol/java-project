package com.lecom.vandistribution.vdservice.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lecom.vandistribution.vdservice.dao.ProductDetailsEntity;
import com.lecom.vandistribution.vdservice.dao.ProductDetailsRepository;
import com.lecom.vandistribution.vdservice.dto.ProductDetailsDTO;
import com.lecom.vandistribution.vdservice.exception.ProductNotFoundException;
import com.lecom.vandistribution.vdservice.util.VdUtil;

@Service("productDetailsService")
public class ProductDetailsServiceImpl implements ProductDetailsService {

	@Autowired
	private ProductDetailsRepository productDetailsRepo;

	@Autowired
	private VdUtil vdUtil;

	@Override
	public List<ProductDetailsDTO> getProductDetails() {
		List<ProductDetailsEntity> productDetailsEntities = (List<ProductDetailsEntity>) productDetailsRepo.findAll();
		List<ProductDetailsDTO> productDetailsDTOs = vdUtil.mapObjectList(productDetailsEntities,
				ProductDetailsDTO.class);
		return productDetailsDTOs;
	}

	@Override
	public ProductDetailsDTO getProductDetails(Integer id) {
		if (productDetailsRepo.existsById(id)) {
			ProductDetailsEntity productDetailsEntity = (ProductDetailsEntity) productDetailsRepo.findById(id)
					.get();
			ProductDetailsDTO productDetailsDTO = vdUtil.mapObject(productDetailsEntity, ProductDetailsDTO.class);
			return productDetailsDTO;
		}
		throw new ProductNotFoundException();
	}

	@Override
	public ProductDetailsDTO updateProductDetails(Integer id, ProductDetailsDTO productDetailsDTO) {
		if (productDetailsRepo.existsById(id)) {
			Timestamp ct  = productDetailsRepo.findById(id).get().getCreated_date_time();
			Timestamp ut  = new Timestamp(System.currentTimeMillis());
			ProductDetailsEntity productDetailsEntity= vdUtil.mapObject(productDetailsDTO, ProductDetailsEntity.class);
			productDetailsEntity.setCreated_date_time(ct);
			productDetailsEntity.setUpdated_date_time(ut);
			productDetailsRepo.save(productDetailsEntity);
			productDetailsDTO= vdUtil.mapObject(productDetailsEntity, ProductDetailsDTO.class);
			return productDetailsDTO;
		}
		throw new ProductNotFoundException();
	}

	@Override
	public ProductDetailsDTO addProductDetails(ProductDetailsDTO productDetailsDTO) {
		
			Timestamp ct  = new Timestamp(System.currentTimeMillis());
			ProductDetailsEntity productDetailsEntity= vdUtil.mapObject(productDetailsDTO, ProductDetailsEntity.class);
			productDetailsEntity.setCreated_date_time(ct);
			productDetailsEntity.setUpdated_date_time(ct);
			productDetailsRepo.save(productDetailsEntity);
			productDetailsDTO= vdUtil.mapObject(productDetailsEntity, ProductDetailsDTO.class);
			return productDetailsDTO;		
	}

	@Override
	public Boolean removeProductDetails(Integer id) {
		if (productDetailsRepo.existsById(id)) {
			productDetailsRepo.deleteById(id);
			return !productDetailsRepo.existsById(id);
		}
		throw new ProductNotFoundException();
	}

}
