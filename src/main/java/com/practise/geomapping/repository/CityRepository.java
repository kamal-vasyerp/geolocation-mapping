package com.practise.geomapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practise.geomapping.model.City;

public interface CityRepository extends JpaRepository<City, Integer>{

}
