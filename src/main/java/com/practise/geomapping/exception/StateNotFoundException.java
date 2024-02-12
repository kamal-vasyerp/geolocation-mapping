package com.practise.geomapping.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StateNotFoundException extends RuntimeException{

	public StateNotFoundException(String message) {
		super(message);
	}
}
