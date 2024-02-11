package com.practise.geomapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.practise.geomapping.dto.ResponceState;
import com.practise.geomapping.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {
	
	@Query("SELECT new com.practise.geomapping.dto.ResponceState(s.stateId , s.stateName) FROM State s WHERE country.countryId = :id")
	public List<ResponceState> allStateinCountry(@Param("id") int id);

	
}
