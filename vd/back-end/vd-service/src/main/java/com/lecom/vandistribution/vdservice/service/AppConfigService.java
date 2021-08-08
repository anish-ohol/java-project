package com.lecom.vandistribution.vdservice.service;

import java.util.List;

import com.lecom.vandistribution.vdservice.dto.AppConfigDTO;

public interface AppConfigService {	
	public List<AppConfigDTO>getAppConfig();
	public AppConfigDTO getAppConfig(Integer id);
	public AppConfigDTO addAppConfig(AppConfigDTO appConfigDTO);
	public AppConfigDTO updateAppConfig(Integer id , AppConfigDTO appConfigDTO);	
	public List<AppConfigDTO> getAppConfigByType(String propertyType);
	public List<AppConfigDTO> getAppConfigByValue(String propertyValue);
	public List<AppConfigDTO> getAppConfig(String columnName,String columnValue);

	public Boolean removeAppConfig(Integer id);
	
}