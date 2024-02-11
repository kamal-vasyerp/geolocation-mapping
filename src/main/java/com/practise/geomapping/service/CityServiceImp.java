package com.practise.geomapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.geomapping.model.City;
import com.practise.geomapping.repository.CityRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CityServiceImp implements CityService {

	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<City> getAllCity() {
		return cityRepository.findAll();
	}

	@Override
	public City getCity(int cityId) {
		return cityRepository.findById(cityId)
				.orElseThrow(() -> new EntityNotFoundException("City is not present in the database."));
	}

	@Override
	public String saveCity(City city) {
		cityRepository.save(city);
		return "City Saved";
	}

	@Override
	public String deleteCity(int cityId) {
		cityRepository.deleteById(cityId);
		return "City Deleted";
	}

}
