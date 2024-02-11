package com.practise.geomapping.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class City {

	@Id
	private int cityId;
	@Column(name="city_name")
	private String cityName;
	
	@ManyToOne
	@JoinColumn(name="stateId")
	private State state;
}
