package com.practise.geomapping.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CityNotFoundException extends RuntimeException{

	public CityNotFoundException(String message) {
		super(message);
	}
}
