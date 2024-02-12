package com.practise.geomapping.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.practise.geomapping.dto.ResponceDto;
import com.practise.geomapping.exception.CityNotFoundException;
import com.practise.geomapping.exception.CountryNotFoundException;
import com.practise.geomapping.exception.StateNotFoundException;

@RestControllerAdvice
public class GeolocationExceptionHandler {

	@ResponseStatus(code = HttpStatus.NOT_FOUND) 
	@ExceptionHandler(CountryNotFoundException.class)
	public ResponceDto CountryNotFoundExceptionHandler(CountryNotFoundException ex) {
		return new ResponceDto(404,"Country was not available in the database", ex.getStackTrace());
	}
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND) 
	@ExceptionHandler(StateNotFoundException.class)
	public ResponceDto StateNotFoundExceptionHandler(StateNotFoundException ex) {
		return new ResponceDto(404,"State was not available in the database", ex.getStackTrace());
	}
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND) 
	@ExceptionHandler(CityNotFoundException.class)
	public ResponceDto CityNotFoundExceptionHandler(CityNotFoundException ex) {
		return new ResponceDto(404,"City was not available in the database", ex.getStackTrace());
	}
	
}
