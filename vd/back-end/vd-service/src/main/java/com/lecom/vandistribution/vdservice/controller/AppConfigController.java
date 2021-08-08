package com.lecom.vandistribution.vdservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lecom.vandistribution.vdservice.dto.AppConfigDTO;
import com.lecom.vandistribution.vdservice.service.AppConfigService;

@CrossOrigin
@RestController
public class AppConfigController {
	
	@Autowired
	private AppConfigService appConfigService;	
	
	@GetMapping("/appconfig")
    public List<AppConfigDTO> getAppConfigs(){
    	return appConfigService.getAppConfig();
    }
	
	@GetMapping("/appconfig/id/{id}")
    public AppConfigDTO getAppConfigs(@PathVariable Integer id){		  	
    	return appConfigService.getAppConfig(id);
    }
	
	@GetMapping("/appconfig/{columnName}/{columnValue}")
    public List<AppConfigDTO> getAppConfigs(@PathVariable String columnName,@PathVariable String columnValue){
    	return appConfigService.getAppConfig(columnName,columnValue);
    }
	
	@GetMapping("/appconfig/{columnName}")
    public List<AppConfigDTO> getAppConfigs(@PathVariable String columnName){
    	return appConfigService.getAppConfigByType(columnName);
    }
	
	
	@PutMapping("/appconfig/{id}")
    public AppConfigDTO updateAppConfigs( @PathVariable Integer id , @RequestBody AppConfigDTO appConfigDTO ){		  	
    	return appConfigService.updateAppConfig(id, appConfigDTO);
    }
	
	@DeleteMapping("/appconfig/{id}")
    public Boolean deleteAppConfigs( @PathVariable Integer id ) {		  	
    	return appConfigService.removeAppConfig(id);
    }
	
	@PostMapping("/appconfig")
    public AppConfigDTO addAppConfigs(@RequestBody AppConfigDTO appConfigDTO){		  	
    	return appConfigService.addAppConfig(appConfigDTO);
    }
}
