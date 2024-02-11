package com.practise.geomapping.service;

import java.util.List;

import com.practise.geomapping.dto.ResponceState;
import com.practise.geomapping.model.Country;

public interface CountryService {

	public List<Country> getAllCountry();
	public List<ResponceState> getAllStateInCountry(int countryId);
	public Country getCountry(int countryId);
	public String saveCountry(Country country);
	public String deleteCountry(int countryId);
}
