package it.cardinali.log.errori.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import it.cardinali.log.errori.domain.LogError;

@Repository
public interface LogErrorRepository extends PagingAndSortingRepository<LogError, Long> {

	LogError findByCodice(String name);
	
	
	
//	Page<City> findByNameContainingAndCountryContainingAllIgnoringCase(String name,	String country, Pageable pageable);
//
//	City findByNameAndCountryAllIgnoringCase(String name, String country);
	
}
