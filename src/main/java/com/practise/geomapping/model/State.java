package com.practise.geomapping.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class State {

	@Id
	private int stateId;
	@Column(name="state_name")
	private String stateName;
	@Column(name="state_capital")
	private String stateCapital;
	
	@OneToMany(mappedBy = "state",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<City> cityList;
	
	@ManyToOne
	@JoinColumn(name="countryId")
	private Country country;
}
