package com.practise.geomapping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponceDto {

	private int code;
	private String message;
	private Object data;
	
	public ResponceDto(int code, String message) {
		this.code = code;
		this.message = message;
	}
}
