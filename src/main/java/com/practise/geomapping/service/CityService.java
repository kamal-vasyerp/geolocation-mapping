package com.practise.geomapping.service;

import java.util.List;

import com.practise.geomapping.model.City;

public interface CityService {

	public List<City> getAllCity();
	public City getCity(int cityId);
	public String saveCity(City city);
	public String deleteCity(int cityId);
}
