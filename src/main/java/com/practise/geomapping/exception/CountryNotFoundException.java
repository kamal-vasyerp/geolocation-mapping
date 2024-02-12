package com.practise.geomapping.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CountryNotFoundException extends RuntimeException{

	public CountryNotFoundException(String message) {
		super(message);
	}
}
