package com.practise.geomapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise.geomapping.dto.ResponceCity;
import com.practise.geomapping.dto.ResponceDto;
import com.practise.geomapping.dto.ResponceState;
import com.practise.geomapping.model.City;
import com.practise.geomapping.model.Country;
import com.practise.geomapping.model.State;
import com.practise.geomapping.service.CityService;
import com.practise.geomapping.service.CountryService;
import com.practise.geomapping.service.StateService;

@RestController
@RequestMapping("/")
public class geolocationController {

	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StateService stateService;
	
	@Autowired
	private CityService cityService;
	
	@GetMapping("/country")
	public ResponceDto showAllCountry() {
		List<Country> countries = countryService.getAllCountry();
		return new ResponceDto(200,"All the Available Countries",countries);
	}
	
	@GetMapping("/state")
	public ResponceDto showAllState() {
		List<State> states = stateService.getAllState();
		return new ResponceDto(200,"All the Available States",states);
	}
	
	@GetMapping("/city")
	public ResponceDto showAllCity() {
		List<City> cities = cityService.getAllCity();
		return new ResponceDto(200,"All the Available Cities",cities);
	}
	
	@GetMapping("/country/{countryId}")
	public ResponceDto showCountry(@PathVariable("countryId") int countryId) {
		Country country = countryService.getCountry(countryId);
		return new ResponceDto(200,"The requested Country",country);
	}
	
	@GetMapping("/state/{stateId}")
	public ResponceDto showState(@PathVariable("stateId") int stateId) {
		State state = stateService.getState(stateId);
		return new ResponceDto(200,"The requested State",state);
	}
	
	@GetMapping("/city/{cityId}")
	public ResponceDto showCity(@PathVariable("cityId") int cityId) {
		City city = cityService.getCity(cityId);
		return new ResponceDto(200,"The Requested City", city);
	}
	
	@PostMapping("/country")
	public ResponceDto createCountry(@RequestBody Country country) {
		String message = countryService.saveCountry(country);
		return new ResponceDto(200, message);
	}
	
	@PostMapping("/state")
	public ResponceDto createState(@RequestBody State state) {
		String message = stateService.saveState(state);
		return new ResponceDto(200,message);
	}
	
	@PostMapping("/city")
	public ResponceDto createCity(@RequestBody City city) {
		String message = cityService.saveCity(city);
		return new ResponceDto(200,message);
	}
	
	@DeleteMapping("/country/{countryId}")
	public ResponceDto removeCountry(@PathVariable("countryId") int countryId) {
		String message = countryService.deleteCountry(countryId);
		return new ResponceDto(200,message);
	}
	
	@DeleteMapping("/state/{stateId}")
	public ResponceDto removeState(@PathVariable("stateId") int stateId) {
		String message = stateService.deleteState(stateId);
		return new ResponceDto(200,message);
	}
	
	@DeleteMapping("/city/{cityId}")
	public ResponceDto removeCity(@PathVariable("cityId") int cityId) {
		String message = cityService.deleteCity(cityId);
		return new ResponceDto(200,message);
	}
	
	@GetMapping("/country/state/{countryId}")
	public ResponceDto stateInCountry(@PathVariable("countryId") int countryId) {
		List<ResponceState> stateList = countryService.getAllStateInCountry(countryId);
		return new ResponceDto(200,"All the state in the requested country",stateList);
	}
	
	@GetMapping("/state/city/{stateId}")
	public ResponceDto CityInState(@PathVariable("stateId") int stateId) {
		List<ResponceCity> cityList = stateService.getAllCityInState(stateId);
		return new ResponceDto(200,"All the city in the requested state",cityList);
	}
	
}
