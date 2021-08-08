package com.lecom.vandistribution.vdservice.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VanDetailsRepository extends CrudRepository<VanDetailsEntity, Integer>{

	boolean existsByVanNumber(String number);
	Optional<VanDetailsEntity> findByVanNumber(String number);

}
