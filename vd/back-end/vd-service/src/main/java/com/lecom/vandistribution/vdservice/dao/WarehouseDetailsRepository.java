package com.lecom.vandistribution.vdservice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseDetailsRepository extends CrudRepository<WarehouseDetailsEntity, Integer>{
}

