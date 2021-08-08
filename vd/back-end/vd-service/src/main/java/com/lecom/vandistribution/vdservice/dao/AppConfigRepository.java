package com.lecom.vandistribution.vdservice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppConfigRepository extends CrudRepository<AppConfigEntity, Integer>{
	

	public List<AppConfigEntity> findAllByPropertyId(Integer id);
	public List<AppConfigEntity> findAllByPropertyType(String propertyType);
	public List<AppConfigEntity> findAllByPropertyValue(String propertyType);
	public List<AppConfigEntity> findAllByPropertyTypeAndPropertyValue(String propertyType,String propertyValue);

}
