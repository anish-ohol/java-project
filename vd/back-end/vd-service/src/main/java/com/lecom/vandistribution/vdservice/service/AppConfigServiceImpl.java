package com.lecom.vandistribution.vdservice.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lecom.vandistribution.vdservice.dao.AppConfigEntity;
import com.lecom.vandistribution.vdservice.dao.AppConfigRepository;
import com.lecom.vandistribution.vdservice.dto.AppConfigDTO;
import com.lecom.vandistribution.vdservice.exception.AppConfigNotFoundException;
import com.lecom.vandistribution.vdservice.util.VdUtil;

@Service("appConfig")
public class AppConfigServiceImpl implements AppConfigService {

	@Autowired
	private AppConfigRepository appConfigRepo;

	@Autowired
	private VdUtil vdUtil;

	@Override
	public List<AppConfigDTO> getAppConfig() {
		List<AppConfigEntity> appConfigEntities = (List<AppConfigEntity>) appConfigRepo.findAll();
		return vdUtil.mapObjectList(appConfigEntities, AppConfigDTO.class);
	}

	@Override
	public AppConfigDTO getAppConfig(Integer id) {
		Optional<AppConfigEntity> appConfigEntity = (Optional<AppConfigEntity>) appConfigRepo.findById(id);
		if (appConfigEntity != null && !appConfigEntity.isPresent()) {
			return vdUtil.mapObject(appConfigEntity, AppConfigDTO.class);
		}
		throw new AppConfigNotFoundException();
	}

	@Override
	public AppConfigDTO addAppConfig(AppConfigDTO appConfigDTO) {
		AppConfigEntity appConfigEntity = vdUtil.mapObject(appConfigDTO, AppConfigEntity.class);
		Timestamp cd =new Timestamp(System.currentTimeMillis());
		appConfigEntity.setCreated_date_time(cd);
		appConfigEntity.setUpdated_date_time(cd);
		appConfigEntity = appConfigRepo.save(appConfigEntity);
		if (appConfigEntity != null) {
			return vdUtil.mapObject(appConfigEntity, AppConfigDTO.class);
		}
		throw new AppConfigNotFoundException();
	}

	@Override
	public AppConfigDTO updateAppConfig(Integer id, AppConfigDTO appConfigDTO) {
		if (appConfigRepo.existsById(id)) {
			Timestamp ct = appConfigRepo.findById(id).get().getCreated_date_time();
			Timestamp ut = new Timestamp(System.currentTimeMillis());
			AppConfigEntity appConfigEntity = vdUtil.mapObject(appConfigDTO, AppConfigEntity.class);
			appConfigEntity.setCreated_date_time(ct);
			appConfigEntity.setUpdated_date_time(ut);
			appConfigEntity = appConfigRepo.save(appConfigEntity);
			return vdUtil.mapObject(appConfigEntity, AppConfigDTO.class);
		}
		throw new AppConfigNotFoundException();
	}

	@Override
	public List<AppConfigDTO> getAppConfigByType(String propertyType) {
		List<AppConfigEntity> appConfigEntities = (List<AppConfigEntity>) appConfigRepo
				.findAllByPropertyType(propertyType);
		return vdUtil.mapObjectList(appConfigEntities, AppConfigDTO.class);
	}

	@Override
	public List<AppConfigDTO> getAppConfigByValue(String propertyValue) {
		List<AppConfigEntity> appConfigEntities = (List<AppConfigEntity>) appConfigRepo
				.findAllByPropertyValue(propertyValue);
		return vdUtil.mapObjectList(appConfigEntities, AppConfigDTO.class);
	}

	@Override
	public List<AppConfigDTO> getAppConfig(String columnName, String columnValue) {
		List<AppConfigEntity> appConfigEntities = (List<AppConfigEntity>) appConfigRepo
				.findAllByPropertyTypeAndPropertyValue(columnName, columnValue);
		return vdUtil.mapObjectList(appConfigEntities, AppConfigDTO.class);
	}

	@Override
	public Boolean removeAppConfig(Integer id) {
		appConfigRepo.deleteById(id);
		return !appConfigRepo.existsById(id);
	}
}
