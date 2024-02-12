package com.practise.geomapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.geomapping.dto.ResponceState;
import com.practise.geomapping.exception.CountryNotFoundException;
import com.practise.geomapping.model.Country;
import com.practise.geomapping.repository.CountryRepository;


@Service
public class CountryServiceImp implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Override
	public List<Country> getAllCountry() {
		return countryRepository.findAll();
	}

	@Override
	public Country getCountry(int countryId) {
		return countryRepository.findById(countryId)
				.orElseThrow(() -> new CountryNotFoundException("Country is not present in the database."));
	}

	@Override
	public String saveCountry(Country country) {
		countryRepository.save(country);
		return "Country Saved";
	}

	@Override
	public String deleteCountry(int countryId) {
		countryRepository.deleteById(countryId);
		return "Country Deleted";
	}

	@Override
	public List<ResponceState> getAllStateInCountry(int countryId) {
		return countryRepository.allStateinCountry(countryId);
	}

}
