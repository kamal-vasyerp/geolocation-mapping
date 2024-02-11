package com.practise.geomapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.practise.geomapping.dto.ResponceCity;
import com.practise.geomapping.model.State;

public interface StateRepository extends JpaRepository<State, Integer>{
	
	@Query("SELECT new com.practise.geomapping.dto.ResponceCity(c.cityId , c.cityName) FROM City c WHERE state.stateId = :id")
	public List<ResponceCity> allCityinState(@Param("id") int id);

}
